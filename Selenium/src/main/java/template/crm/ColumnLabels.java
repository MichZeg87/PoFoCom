package template.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.grid.viewGrid;
import template.crm.view.GridHeader;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import java.time.Duration;
import java.util.List;

public class ColumnLabels extends AbstractWebDriver {
    Logging logging = new Logging(driver, wait);
    ChooseEntity chooseEntity = new ChooseEntity(driver, wait);
    GridHeader gridHeader = new GridHeader(driver, wait);
    template.crm.grid.viewGrid viewGrid = new viewGrid(driver, wait);
    FindValue findValue = new FindValue(driver,wait);

    public ColumnLabels(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    public List<String> risksColumnsList()throws InterruptedException{
        logging.crmLoggingNewTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        chooseEntity.chooseCZ();
        Thread.sleep(1000);
        gridHeader.risksTable();
        wait.until(findValue.getLoadingCrm());
        return findValue.tableHeaderList(findValue.getCrmHeader(), 0,2);
    }

    public List<String> risksViewColumnList()throws InterruptedException{
        logging.crmLoggingNewTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        chooseEntity.entity6();
        Thread.sleep(1000);
        viewGrid.riskView();
        wait.until(findValue.getLoadingCrm());
        return findValue.tableHeaderList(findValue.getCrmHeader(), 0,2);
    }

    public List<String> vehicleColumnList() throws InterruptedException {
        logging.crmLoggingNewTab();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        chooseEntity.chooseSFA();
        viewGrid.vehicleView();
        wait.until(findValue.getLoadingCrm());
        return findValue.tableHeaderList(findValue.getCrmHeader(), 0,2);
    }
}
