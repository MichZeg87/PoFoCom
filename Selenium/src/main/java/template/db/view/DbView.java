package template.db.view;

import template.Logging;
import template.db.ChooseEntity;
import template.utils.AbstractWebDriver;
import template.utils.Variables;
import template.utils.FindValue;
import org.openqa.selenium.*;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;
import java.util.Map;

public class DbView extends AbstractWebDriver {

    public DbView(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    FindValue findValue = new FindValue(driver, wait);
    Logging logging = new Logging(driver, wait);
    ChooseEntity chooseEntity = new ChooseEntity(driver, wait);
    GridHeader gridHeader = new GridHeader(driver, wait);
    public Variables book = new Variables(4, 5, 100, 1, 100, 100, 100, 100, 100);
    public Variables insp = new Variables(6, 20, 100, 1, 100, 100, 100, 100, 100);
    public Variables neutral = new Variables(100, 100, 100, 1, 100, 100, 100, 100, 100);


    public Map<Integer, List<String>> riskMap() throws InterruptedException {
        logging.loggingNewTab();
        chooseEntity.entity1();
        Thread.sleep(2000);
        gridHeader.risksTable();
        return findValue.allTableMapFromCrm(new Variables(100, 100, 5, 1, 100
                , 100, 100, 100, 100));
    }

    public Map<Integer, List<String>> bookMap() throws InterruptedException {
        logging.loggingNewTab();
        chooseEntity.entity2();
        Thread.sleep(2000);
        gridHeader.bookTable();
        return findValue.allTableMapFromCrm(book);
    }

    public Map<Integer, List<String>> inspectionMap() throws InterruptedException {
        logging.loggingNewTab();
        chooseEntity.entity3();
        Thread.sleep(2000);
        gridHeader.vehicleInspectionTable();
        return findValue.allTableMapFromCrm(insp);
    }

    public Map<Integer, List<String>> userMap() throws InterruptedException {
        logging.loggingNewTab();
        chooseEntity.entity4();
        Thread.sleep(2000);
        gridHeader.userTable();
        return findValue.allTableMapFromCrm(neutral);
    }
}
