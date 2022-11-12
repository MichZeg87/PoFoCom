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
import template.crm.ColumnLabels;
import template.uatzone.SKColumnsName;
import java.time.Duration;

public class ColumnLabelsTestSuit {
    public ColumnLabelsTestSuit() {
        PageFactory.initElements(this.driver, this);
    }

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    Logging logging = new Logging(driver, wait);
    ColumnLabels columnLabels = new ColumnLabels(driver, wait);
    SKColumnsName skColumnsName = new SKColumnsName(driver, wait);
    String url = "";

    @BeforeAll
    public void setup() {
        System.setProperty("webdriver.chrome.driver", "\\chrome\\chromedriver.exe");
        driver.get(url);
        driver.manage().window().maximize();
        logging.logIn("", "");
    }

    @AfterAll // zamyka wszystkie karty
    public void close(){
        driver.getWindowHandles()
                .forEach(w-> {driver
                        .switchTo()
                        .window(w);
                    driver.close();
                });

    }

    @Test
    public void archiwalnePolisy() throws InterruptedException  {
        Assertions.assertEquals(skColumnsName.menu2(), columnLabels.risksColumnsList());
    }

    @Test
    public void wygasajacePolisy() throws InterruptedException   {
        Assertions.assertEquals(skColumnsName.menu52(), columnLabels.vehicleColumnList());
    }

    @Test
    public void zakupionePolisy()  throws InterruptedException {
        Assertions.assertEquals(skColumnsName.menu51(), columnLabels.risksViewColumnList());
    }
}
