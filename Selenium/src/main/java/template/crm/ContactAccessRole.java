package template.crm;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.view.GridHeader;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;
import java.util.Locale;
import java.util.Set;

public class ContactAccessRole extends AbstractWebDriver {

    public ContactAccessRole(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    Logging logging = new Logging(driver, wait);
    ChooseEntity chooseEntity = new ChooseEntity(driver, wait);
    GridHeader gridHeader = new GridHeader(driver,wait);
    FindValue wartosci = new FindValue(driver, wait);
    Actions act = new Actions(driver);
    String xpath = "//*/div[@id='r_divDataArea']/div/table[@id='gridBodyTable']/tbody/";
    Set<String> menu = new HashSet<>();

    @FindBy(xpath = "//*[@id=]/tbody/tr[1]/td[6]")
    WebElement emailField;
	@FindBy(xpath="//*[@id=]/div/table/tbody/tr/td[2]/nobr/a/li/span/span/span[2]")
	private WebElement grupaUzytkownika;
	@FindBy(xpath="//*/div[@id=\"\"]/div/table[@id=\"gridBodyTable\"]/tbody/tr")
	private List<WebElement> listUserGroup;
	@FindBy(xpath="//*/div[@id=]/div/table[@id=]/tbody/tr")
	private List<WebElement> listMenuRoles;
	@FindBy(xpath="//div[contains(@id, 'r')]/div[2]/div/table[contains(@id, '')]/tbody/tr/td[2]/a[contains(@disabled, 'disabled') and contains(@id, '_nextPageImg')]")
	private List<WebElement> listDisabledNext;

    public Set<String> getMenu() {
        return menu;
    }

    public Set<String> selectContactWithUniqueEmail(String login) throws InterruptedException {
        chooseEntity.entity4();
        wait.until(wartosci.getLoadingCrm());
        gridHeader.searchValue(login);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        act.doubleClick(emailField).perform();
        wait.until(wartosci.getLoadingCrm());
        driver.switchTo().defaultContent();
        driver.switchTo().frame(1);
        grupaUzytkownika.click();
        openMenuRoles(menu);
        menu.remove("menu");
        menu.remove("");
        System.out.println(menu);
        return menu;
    }

    public void openMenuRoles(Set<String> menu) throws InterruptedException {
        int count = 0;
        while (listDisabledNext.isEmpty()) {
                openMenuLists(menu, count);
            count++;
            wartosci.getCrmNastStr().click();
            Thread.sleep(200);
        }
        openMenuLists(menu, count);
    }

    public void openMenuLists(Set<String> menu, int count) throws InterruptedException {
        for (int n = 0; n < listUserGroup.size(); n++) {
            act.doubleClick(driver.findElement(By.xpath(xpath + "tr[" + (n + 1) + "]"))).perform();
            wait.until(wartosci.getLoadingCrm());
            addMenuToList(menu);
            while (wartosci.getCrmNastStrDisabled().isEmpty()) {
                wartosci.getCrmNastStr().click();
                addMenuToList(menu);
            }
            driver.navigate().back();
            wait.until(wartosci.getLoadingCrm());
            driver.switchTo().defaultContent();
            driver.switchTo().frame(1);
            for (int a = 0; a < count; a++) {
                Thread.sleep(200);
                wartosci.getCrmNastStr().click();
                Thread.sleep(200);
            }
        }
    }

    public void addMenuToList(Set<String> menu) {
        for (int i = 0; i < listMenuRoles.size(); i++) {
            String value = driver.findElement(By
                    .xpath("//*/div[@id=\"m_divDataArea\"]/div/table[@id=\"gridBodyTable\"]/tbody/tr[" + (i + 1) + "]/td[2]"))
                    .getText().trim().toLowerCase(Locale.ROOT);
            menu.add(value);
        }

    }

    public Set<String> crmMenuChecker (String login) throws InterruptedException {
        logging.crmLoggingNewTab();
        selectContactWithUniqueEmail(login);
        return menu;
    }


}
