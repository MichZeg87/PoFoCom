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
import template.db.view.DbView;
import template.uat.Table;
import template.uat.chooseMenu;
import template.utils.DebugUtils;
import java.time.Duration;
import java.util.HashSet;
import java.util.List;

public class ViewTests {

    String url = "";
    String login = "";
    String pass = "";


    public ViewTests() {
        PageFactory.initElements(this.driver, this);
    }

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    Logging logging = new Logging(driver, wait);
    DbView dbView = new DbView(driver, wait);
    Table table = new Table(driver, wait);
    DebugUtils debugUtils = new DebugUtils();
    chooseMenu chooseMenu = new chooseMenu(driver, wait);


    @BeforeAll
    public static void setup() {
        WebDriverManager.chromedriver().setup();
    }

    public void compare(HashSet<List<String>> sk, HashSet<List<String>> crm) {
        try {
            Assertions.assertEquals(sk, crm);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(sk, crm);
        }
    }

    @Test
    public void test2() throws InterruptedException{
        HashSet<List<String>> sk = new HashSet<>(table.mapMenu4().values());
        HashSet<List<String>> crm = new HashSet<>(dbView.bookMap().values());
        compare(sk, crm);
    }

    @Test
    public void test() throws InterruptedException {
        HashSet<List<String>> sk = new HashSet<>(table.mapMenu34().values());
        HashSet<List<String>> crm = new HashSet<>(dbView.bookMap().values());
        try {
            Assertions.assertEquals(sk, crm);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(sk, crm);
        }
    }

    @Test
    public void porownanieAktywnePolisy()throws InterruptedException {
        if(!chooseMenu.getMenuH().isEmpty()) {
            HashSet<List<String>> sk = new HashSet<>(table.mapMenu1().values());
            HashSet<List<String>> crm = new HashSet<>(dbView.inspectionMap().values());
            try {
                Assertions.assertEquals(sk, crm);
            } catch (AssertionError e) {
                debugUtils.sortedOutput(sk, crm);
            }
        } else {
            System.out.println("Skiped");
        }
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
}

