package compareTestSuit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.form.CRMForm;
import template.uatzone.SKForm;
import template.utils.DebugUtils;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

public class FormTests {

    public FormTests() {
        PageFactory.initElements(this.driver, this);
    }

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    Logging logging = new Logging(driver, wait);
    CRMForm crmForm = new CRMForm(driver, wait);
    SKForm skForm = new SKForm(driver,wait);
    DebugUtils debugUtils = new DebugUtils();
    String url = "";

    @BeforeAll
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
    }


    @AfterAll // zamyka wszystkie karty
    public void close(){
        driver.getWindowHandles()
                .forEach(w-> {driver
                        .switchTo()
                        .window(w);
                    driver.close();});
    }

    @Test
    public void compareMenu12AndUser() throws InterruptedException {
        HashSet<List<String>> sK = new HashSet<>(skForm.menu12().values());
        HashSet<List<String>> cRM = new HashSet<>(crmForm.activeUser().values());
        try {
            Assertions.assertEquals(sK, cRM);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(sK, cRM);
        }
    }

    @Test
    public void compareMenu11AndInspect() throws InterruptedException {
        HashSet<List<String>> sK = new HashSet<>(skForm.menu11().values());
        HashSet<List<String>> cRM = new HashSet<>(crmForm.inspectionsToBePerformed().values());
        try {
            Assertions.assertEquals(sK, cRM);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(sK, cRM);
        }
    }
}
