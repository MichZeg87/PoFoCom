package new_customerTestSuit;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;

import java.time.Duration;
import java.util.List;

public class CheckIfPassCorrecttest {

    @FindBy (xpath = "//a[contains(@href, '/Account/Register')]")
    WebElement isLogged;
    @FindBy (id = "pc_home_menu")
    List<WebElement> home;

    public CheckIfPassCorrecttest() {
        PageFactory.initElements(this.driver, this);
    }

    WebDriver driver = new ChromeDriver();
    WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
    Logging logging = new Logging(driver, wait);


    @ParameterizedTest
    @CsvFileSource(resources = "login.csv", numLinesToSkip = 1)
    public void passwortChecker(String login, String pass, String url) {
        driver.get(url);
        driver.manage().window().maximize();
        logging.logIn(login,pass);
        wait.until(ExpectedConditions.invisibilityOf(isLogged));
        Assertions.assertEquals(1, home.size());
        driver.close();

    }
}
