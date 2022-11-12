package new_customerTestSuit;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.ContactAccessRole;
import template.crm.CrmAllTables;
import template.crm.AdvancedSearch;
import template.crm.view.CRMView;
import template.uatzone.*;
import template.utils.DebugUtils;
import java.time.Duration;
import java.util.*;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CompareDataTests {

    String url = "";
    String account = "";
    String email = "";

    public CompareDataTests() {
        PageFactory.initElements(driver, this);
    }

    public static final String RED_BRIGHT = "\033[0;91m";    // RED
    public static final String GREEN_BRIGHT = "\033[0;92m";  // GREEN
    public static final String RESET = "\033[0m";
    static WebDriver driver;
    static WebDriverWait wait;
    Logging logging = new Logging(driver, wait);
    chooseMenu chooseMenu = new chooseMenu(driver, wait);
    SKTable skTable = new SKTable(driver, wait);
    DebugUtils debugUtils = new DebugUtils();
    AdvancedSearch search = new AdvancedSearch(driver, wait);
    CheckMenuExist isMenuDisplay = new CheckMenuExist(driver, wait);
    ContactAccessRole crmMenus = new ContactAccessRole(driver, wait);
    SKForm skForm = new SKForm(driver, wait);
    CrmAllTables crmAllTables = new CrmAllTables(driver, wait);
    static List<String> windowHandles = new ArrayList<>();
    static List<String> menuList = new ArrayList<>();
    Set<String> menuSet = new HashSet<>();
    SKAllMenus skAllMenus = new SKAllMenus(driver, wait);
    CRMView crmView = new CRMView(driver, wait);

    public void compareSets(String menuName, HashSet<List<String>> sk, HashSet<List<String>> crm) {
        if (menuList.contains(menuName)) {
            System.out.println(menuName + "Skipped");
        } else {
            try {
                System.out.println(menuName);
                Assertions.assertEquals(sk, crm);
                System.out.println(GREEN_BRIGHT + menuName + "OK" + RESET);
            } catch (AssertionError e) {
                System.out.println(RED_BRIGHT + "! Assert failed !" + RESET);
                debugUtils.sortedOutput(sk, crm);
            }
            driver.switchTo().window(windowHandles.get(0));
        }
    }

    @BeforeAll
    static void setDriver() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    }

    public void setAccount() {
        System.out.println("Start wyszukiwanie");
        search.changeAllAccounts("");
    }


    public void run() {
    logging.logIn("", "");
        driver.get(url);
        driver.manage().window().maximize();
//        logowanie.crmLogging();

    }

    @ParameterizedTest
    @Order(1)
    @CsvFileSource(resources = "/test.csv", numLinesToSkip = 1)
    void setup(String domain, String account, String email, String id, String pass) throws InterruptedException {
    id.toLowerCase(Locale.ROOT);
    driver.get("http://"+ domain +"/logowanie.aspx");
    driver.manage().window().maximize();
    logging.crmLoggingNewTab();
    driver.get(logging.crmSearch);
    search.changeAllAccounts(account);
    driver.getWindowHandles().forEach(w-> {
            driver.switchTo().window(w);
            windowHandles.add(w);
            });
    driver.get(id);
    crmMenus.openMenuRoles(menuSet);
    driver.switchTo().window(windowHandles.get(0));
        if (pass != null) {
            logging.logIn(email, pass);
        } else {
            logging.firstLogSK(email, 15, 2,3,4);
        }
    }
@Test
@Order(2)
    public void checkIfMenusEquals() throws InterruptedException {
        logging.logIn(account, "");
        Assertions.assertEquals(isMenuDisplay.checkMenuSet(), crmMenus.crmMenuChecker(email));
    }
    @Test
    @Order(3)
    public void atest() throws InterruptedException {
        System.out.println( menuList.size());
        skTable.mapMenu34();
        driver.switchTo().window(windowHandles.get(1));
        System.out.println(menuList.get(1));
        driver.switchTo().window(windowHandles.get(0));
    }
    @Test
    @Order(5)
    public void compareDataBetweenSKAndCrm() throws InterruptedException {
    crmAllTables.addEntitiesToMap();
    driver.get("");
    logging.logIn("", "");
        driver.manage().window().maximize();
    skAllMenus.allTables();
    Assertions.assertEquals(crmAllTables.getEntityMap(), skAllMenus.getMenuMap());

    }
    @Test
    @Order(6)
    public void compareTableMap() throws InterruptedException{
        HashSet<List<String>> sk = new HashSet<>(skTable.mapMenu925().values());
        HashSet<List<String>> crm = new HashSet<>(crmView.riskMap().values());
        try {
            Assertions.assertEquals(sk, crm);
        } catch (AssertionError e) {
            debugUtils.sortedOutput(sk, crm);
        }
        windowHandles.add(driver.getWindowHandle());
        driver.switchTo().window(windowHandles.get(0));
        System.out.println( menuList.size());
    }

    @Test
    @Order(4)
    public void test() {
        skTable.mapMenu34();
    }

}


