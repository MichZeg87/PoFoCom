package template.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.*;

public class FindValue extends AbstractWebDriver {

    public FindValue(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    ExpectedCondition<Boolean> loading = ExpectedConditions.invisibilityOfElementLocated(By
             .cssSelector(".dataTables_processing:nth-child(5) > div"));
    ExpectedCondition<Boolean> loading2 = ExpectedConditions.invisibilityOfElementLocated(By
            .cssSelector(".dataTables_processing:nth-child(6) img"));
    ExpectedCondition<Boolean> loading3 = ExpectedConditions.invisibilityOfElementLocated(By
            .xpath("//*[@id=\"ryzyka_wrapper\"]/div[5]/div"));
    ExpectedCondition<Boolean> loadingCrm = ExpectedConditions.invisibilityOfElementLocated(By.id("loading"));
    Map<Integer, List<String>> rowValue = new HashMap<>();
    List<String> columnName = new ArrayList<>();

    public void skWait() {
        wait.until(ExpectedConditions.and(loading2, loading, loading3));
    }

    @FindBy(xpath = "//*[@id=\"table_next\"]")
    WebElement skNastStr;
    @FindBy (xpath = "//a[contains(@id, 'table_next') and not(contains(@class, 'paginate_button next disabled'))]")
    List<WebElement> skNastStrEnabled;
    @FindBy(id = "page_R0")
    WebElement crmNastStr;
    @FindBy (xpath = "//a[contains(@disabled, 'disabled') and contains(@id, '_nextPageImg')]")
    List<WebElement> crmNastStrDisabled;
    @FindBy (xpath = "//*[@id=\"table\"]/tbody/tr[td[not(contains(@title, 'Brak danych'))]]")
    List<WebElement> skRow;
    @FindBy (xpath = "//*[@id=\"gridBodyTable\"]/tbody/tr[contains(@class, 'ms-crm-List-Row')]")
    List<WebElement> crmRow;
    @FindBy (xpath = "//*[@id=\"table\"]/thead/tr/th")
    List<WebElement> skHeader;
    @FindBy (xpath = "//*[@id=\"crmGrid_gridBar\"]/tbody/tr/th")
    List<WebElement> crmHeader;
    @FindBy(xpath = "//option[. = '100']")
    WebElement show100Row;
    @FindBy(xpath = "/html/body/header/a[2]")
    WebElement breadcrumb;
    @FindBy(xpath = "//div[3]/div/div[1]/div/div/ul/li")
    List<WebElement> cardSize;
    String form = "//div[3]/div/div[1]/div/div/ul";
    String formKom = "ul/li/div/div/";
    String details = "//*[@id=\"table\"]/tbody/";

    public WebElement getShow100Row() {
        return show100Row;
    }
    public WebElement getBreadcrumb() {
        return breadcrumb;
    }
    public List<WebElement> getSkHeader() {
        return skHeader;
    }
    public List<WebElement> getCrmHeader() {
        return crmHeader;
    }
    public ExpectedCondition<Boolean> getLoadingCrm() {
        return loadingCrm;
    }
    public List<WebElement> getCrmRow() {
        return crmRow;
    }
    public WebElement getCrmNastStr() {
        return crmNastStr;
    }
    public List<WebElement> getCrmNastStrDisabled() {
        return crmNastStrDisabled;
    }



    public List<String> tableHeaderList(List<WebElement> header, int lstCol, int product){
        for (int numCol = 0; numCol < header.size() - lstCol; numCol++) {
            if(product == 1) {
                String propName = header.get(numCol).getText()
                        .replace("P", "Pr");

                columnName.add(numCol, propName);
            } else {
                String Name = header.get(numCol).getText()
                        .replace("Kl (Za)", "Zy")
                        .replace(" (Nr p)", "")
                        .replace(" (U)", "")
                        .replace(" (Nr r)", "")
                        .replace(" (P)", "")
                        .replace(" (Z)", "")
                        .replace(" (Sz)", "");
                columnName.add(numCol, Name);
            }
        }
        return columnName;
    }

    public List<String> addGridHeaderToList(WebElement card, int kolSzczeg, List<WebElement> header, int lstCln) {
        wait.until(ExpectedConditions.and(loading2, loading, loading3));
        driver.findElement(By.xpath(details + "tr[1]/td[" + kolSzczeg + "]/a")).click();
        card.click();
        wait.until(ExpectedConditions.and(loading2, loading,loading3));
        for (int cln = 0; cln < header.size() - lstCln; cln++) {
            String clnName = header.get(cln).getAttribute("aria-label")
                    .replace(": akty", "")
                    .replace(": aktywuj, ","")
                    .trim();
            columnName.add(cln, clnName);
        }
        return columnName;
    }

    public void crmTableToMap(int count, Variables variables) {
        for (int row = 0; row < crmRow.size(); row++) { //pętla wydobywająca wiersze
            List<WebElement> tableCls = crmRow.get(row).findElements(By.tagName("td"));
            for (int cls = variables.firstCol; cls < (tableCls.size() - 2); cls++) {// pętla wydobywa kolumny z wiersza
                String cellValue = tableCls.get(cls).getText()
                        .replace(",",".")
                        .replace("(brak nazwy)","")
                        .toLowerCase().trim(); // Wydobywa tekst z komórki
                int rowNbr = row + count; // wykorzystywany w przypadku większej ilości rekordów niż 100
                if (cls == variables.col2 || cls == variables.col3 || cls == variables.col5
                        || cls == variables.col7 || cls == variables.col6) { // formatowanie komórki
                    String correctCellValue = cellValue.replace("zł", "")
                            .replace(" ","").replace(",",".").trim();
                    rowValue.get(rowNbr).add(correctCellValue);
                } else if (cls == variables.col1 || cls == variables.col4) { // formatowanie daty usuwanie godziny
                    if (cellValue.length() < 7) {
                        rowValue.get(rowNbr).add(cellValue);
                    } else {
                        String correctCellValue = cellValue.substring(0, cellValue.length() - 6);
                        rowValue.get(rowNbr).add(correctCellValue);
                    }
                } else if (cls == variables.col8 && !cellValue.isEmpty()) {
                    rowValue.get(rowNbr).add("pobierz");
                    String newValue = rowValue.replaceAll("<[^>]*>", "");
                } else if (rowValue.containsKey(rowNbr)) { // przypisanie wartości komórki do mapy
                    rowValue.get(rowNbr).add(cellValue);
                } else {
                    rowValue.put(rowNbr, new ArrayList<>());
                    rowValue.get(rowNbr).add(cellValue);
                }
            }
        }
    }

    public void SKTableToMap(List<WebElement> tableList, int count) {
        for (int row = 0; row < tableList.size(); row++) { //pętla wydobywająca wiersze
            List<WebElement> tabCls = tableList.get(row).findElements(By.tagName("td"));
            for (int Cln = 0; Cln < (tabCls.size() - 1); Cln++) {// pętla wydobywa kolumny z wiersza
                String cellValue = tabCls.get(Cln).getAttribute("title")
                        .replace(",", ".").toLowerCase().trim();// Wydobywa tekst z komórki
                int Num = row + count; // wykorzystywany w przypadku większej ilości rekordów niż 100
                if (rowValue.containsKey(Num)) { // przypisanie wartości komórki do mapy
                    rowValue.get(Num).add(cellValue);
                } else {
                    rowValue.put(Num, new ArrayList<>());
                    rowValue.get(Num).add(cellValue);
                }
            }
        }
    }

    public Map<Integer, List<String>> allTableMapFromSK() {
        wait.until(ExpectedConditions.and(loading2, loading));
        int count = 0;
            SKTableToMap(skRow, count);
            while (!(skNastStrEnabled.isEmpty())) { // jeśli na stronie Strefa Klienta dostępny jest przycisk następna strona
                skNastStr.click();
                count++;
                wait.until(ExpectedConditions.and(loading2, loading));
                SKTableToMap(skRow, (count * 100));
            }
        return rowValue;
    }

    public Map<Integer, List<String>> allTableMapFromCrm(Variables variables){
        int count = 0;
        wait.until(loadingCrm);
        crmTableToMap(count, variables);
        while (crmNastStrDisabled.isEmpty()) { // jeśli w CRM jest dostępny przycisk następna strona
            crmNastStr.click();
            count++;
            wait.until(loadingCrm);
            crmTableToMap((count * 250), variables);
        }
        return rowValue;
    }

    public void allTableMapFromGrid(int count, List<WebElement> table, List<WebElement>listNext, WebElement next) {
        wait.until(ExpectedConditions.and(loading2, loading, loading3));
        SKTableToMap(table, count);
        while (!(listNext.isEmpty())) {
            next.click();
            count++;
            wait.until(ExpectedConditions.and(loading2, loading,loading3));
            SKTableToMap(table, (count * 10));
        }
    }

    public void valueMapFromGrid(WebElement card, int clnDetails, List<WebElement> table,
                                 List<WebElement>listNext, WebElement next, int count) {
        show100Row.click();
        wait.until(ExpectedConditions.and(loading2, loading, loading3));
        for (int n = 0; n < skRow.size(); n++) {
            int row = 1 + n;
            driver.findElement(By.xpath(details + "tr[" + row + "]/td["+ clnDetails +"]/a")).click();
            card.click();
            wait.until(ExpectedConditions.and(loading2, loading, loading3));
            allTableMapFromGrid(count, table, listNext, next);
            count += table.size();
            breadcrumb.click();
            show100Row.click();
            wait.until(ExpectedConditions.and(loading2, loading, loading3));
        }
    }

    public Map<Integer, List<String>> allRowsGridValue(WebElement card, int clnDetails, List<WebElement>table,
                                                       List<WebElement>listNext, WebElement next){
        valueMapFromGrid(card, clnDetails, table, listNext, next, rowValue.size());
        while (!skNastStrEnabled.isEmpty()) {
            skNastStr.click();
            show100Row.click();
            wait.until(ExpectedConditions.and(loading2, loading));
            valueMapFromGrid(card, clnDetails, table, listNext, next, rowValue.size());
        }
        return rowValue;
    }

    public void addFormValues(int nrOFCard, int clnDetails, int count, WebElement back) {
        for (int n = 0; n < skRow.size(); n++) {
            int nrRowTab = n + count;
            int row = 1 + n;
            driver.findElement(By.xpath(details + "tr[" + row + "]/td["+ clnDetails +"]/a")).click();
            for (int k = 0; k < (cardSize.size()- nrOFCard); k++) {
                int card = 1 + k;
                List<WebElement> sectionSize = driver.findElements(By.xpath(form + "/li["+ card +"]/div"));
                driver.findElement(By.xpath("//div[3]/div/div[1]/div/ul/li["+ card +"]")).click();
                for (int s = 0; s < sectionSize.size() ; s++) {
                    int sectionNr = 1 + s;
                    List<WebElement> rowSize = driver.findElements(By.xpath(form + "/li["+ card +"]/div["+ sectionNr +"]/div"));
                    for (int f = 0; f < rowSize.size(); f++) {
                        int roweNr = 1 + f;
                        List<WebElement> kolumnSize = driver.findElements(By.xpath(form +
                                "/li["+ card +"]/div["+ sectionNr +"]/div["+ roweNr +"]/div"));
                        for (int i = 0; i < kolumnSize.size(); i++) {
                            int clnNr = 1 + i;
                            List<WebElement> ifHeader =  driver.findElements(By.xpath(form + "/li["+ card +"]/div["+ sectionNr +"]/" +
                                            "div["+ roweNr +"]/div["+ clnNr +"]/" + formKom + "div"));
                            String value = driver.findElement(By.xpath(form + "/li["+ card +"]/div["+ sectionNr +"]/" +
                                            "div["+ roweNr +"]/div["+ clnNr +"]/" + formKom + "div["+ifHeader.size()+"]/b"))
                                    .getText().replace(",", ".").toLowerCase().trim();
                            if("brak danych".equals(value)) {
                               String newValue = value.replace("brak danych","");
                                rowValue.getOrDefault(nrRowTab, new ArrayList<>()).add(newValue);
                            } else if (rowValue.containsKey(nrRowTab)) {
                                rowValue.get(nrRowTab).add(value);
                            } else {
                                rowValue.put(nrRowTab, new ArrayList<>());
                                rowValue.get(nrRowTab).add(value);
                            }
                        }
                    }
                }
            }
            back.click();
            driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
            show100Row.click();
            wait.until(ExpectedConditions.and(loading2, loading));
        }
    }

    public Map<Integer, List<String>> formValuesFromAllRows(int nrOFCard, int clnDetails, WebElement bredcrumb) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        show100Row.click();
        wait.until(ExpectedConditions.and(loading2, loading));
        int licznik = 0;
        addFormValues(nrOFCard, clnDetails, licznik, bredcrumb);
        while (!skNastStrEnabled.isEmpty()) {
            licznik++;
            skNastStr.click();
            show100Row.click();
            wait.until(ExpectedConditions.and(loading2, loading));
            addFormValues(nrOFCard, clnDetails, (licznik * 100), bredcrumb);
        }
        return rowValue;
    }
}

