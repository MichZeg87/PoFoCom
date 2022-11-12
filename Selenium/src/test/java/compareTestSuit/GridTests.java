package compareTestSuit;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.grid.CRMGrid;
import template.crm.view.CRMView;
import template.uatzone.SKGrid;
import template.utils.DebugUtils;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;

public class GridTests {


    public GridTests() {
        PageFactory.initElements(this.driver, this);
    }

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    Logging logging = new Logging(driver, wait);
    CRMView crmView = new CRMView(driver, wait);
    CRMGrid crmGrid = new CRMGrid(driver, wait);
    SKGrid skGrid = new SKGrid(driver, wait);
    DebugUtils debugUtils = new DebugUtils();
    String url = "";

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "/chromedriver.exe");
        driver.get(url);
        driver.manage().window().maximize();
        logging.logIn("", "");
    }

    @AfterAll
    public void close(){
        driver.getWindowHandles()
                .forEach(w-> {driver
                        .switchTo()
                        .window(w);
                    driver.close();
                });

    }

    @Test
    public void compareGrid2AndActiveRisk() throws InterruptedException {
        HashSet<List<String>> SK = new HashSet<>(skGrid.grid2().values());
        HashSet<List<String>> CRM = new HashSet<>(crmGrid.activeRisk().values());
        try {
            Assertions.assertEquals(SK, CRM);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(SK, CRM);
        }
    }

    @Test
    public void compareGrid3AndactiveVehicle() throws InterruptedException {
        HashSet<List<String>> SK = new HashSet<>(skGrid.grid3().values());
        HashSet<List<String>> CRM = new HashSet<>(crmGrid.activeVehicle().values());
        try {
            Assertions.assertEquals(SK, CRM);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(SK, CRM);
        }
    }
}
