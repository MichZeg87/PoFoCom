package template.crm.form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.ChooseEntity;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import template.utils.Variables;
import java.util.List;
import java.util.Map;

public class CRMForm extends AbstractWebDriver {

    public CRMForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }
    FindValue findValue = new FindValue(driver, wait);
    Logging logging = new Logging(driver,wait);
    ChooseEntity chooseEntity = new ChooseEntity(driver, wait);
    ViewForForm viewForForm = new ViewForForm(driver, wait);
    public Variables pojazd = new Variables(100,100, 18,1,19,7,11,12,100);
    public Variables neutral = new Variables(100,100, 100,1,100,100,100,100,100);
    public Variables szkody = new Variables(100,100, 20,1,100,100,100,100,100);
    public Variables kontrahent = new Variables(100,100, 100,2,100,100,100,100,100);
    public Variables zamowienia = new Variables(100,100, 100,1,100,100,100,100,9);
    public Variables umowa = new Variables(100,100, 100,1,100,100,100,100,3);
    public Variables uczestnictwa = new Variables(100,100, 3,1,100,100,100,100,100);
    public Variables uczestnNieAkt = new Variables(20,20, 5,1,6,100,100,100,100);



    public Map<Integer, List<String>> inspectionsToBePerformed() throws InterruptedException {
        logging.crmLoggingNewTab();
        chooseEntity.entity7();
        viewForForm.vehicleInspection();
        return findValue.allTableMapFromCrm(neutral);
    }



    public Map<Integer, List<String>> activeUser() throws InterruptedException {
        logging.crmLoggingNewTab();
        chooseEntity.entity8();
        Thread.sleep(1000);
        viewForForm.user();
        return findValue.allTableMapFromCrm(uczestnictwa);
    }

}
