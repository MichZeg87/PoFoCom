package template.crm.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.ChooseEntity;
import template.utils.AbstractWebDriver;
import template.utils.Variables;
import template.utils.FindValue;
import java.util.List;
import java.util.Map;

public class CRMGrid extends AbstractWebDriver {
    public CRMGrid(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    FindValue findValue = new FindValue(driver, wait);
    Logging logging = new Logging(driver,wait);
    ChooseEntity chooseEntity = new ChooseEntity(driver, wait);
    viewGrid viewGrid = new viewGrid(driver, wait);
    Variables neutral = new Variables(100,100, 100,1,100,100,100,100,100);
    public Variables vehicle = new Variables(5,20, 100,1,100,100,100,100,100);

    public Map<Integer, List<String>> activeRisk() throws InterruptedException {
        logging.crmLoggingNewTab();
        chooseEntity.entity6();
        Thread.sleep(1000);
        viewGrid.riskView();
        return findValue.allTableMapFromCrm(neutral);
    }

    public Map<Integer, List<String>> activeVehicle() throws InterruptedException {
        logging.crmLoggingNewTab();
        chooseEntity.entity6();
        viewGrid.vehicleView();
        return findValue.allTableMapFromCrm(vehicle);
    }
}
