package template;

import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.uat.RandomPassGen;
import template.utils.AbstractWebDriver;

import java.io.FileOutputStream;
import java.io.IOException;

public class Logging extends AbstractWebDriver {

    public Logging(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    public  final String url = "";
    public  final String search = "";

    FileOutputStream fos;
    RandomPassGen passGen = new RandomPassGen();

    private void fileOutput(String output) {
        try {
            fos = new FileOutputStream("src/test/resources/test.txt", true);
            fos.write(output.getBytes());
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    @FindBy (id="EmailOrLogin")
    WebElement usernameInput;
    @FindBy(css = ".btn:nth-child(1)")
    WebElement dalejButton;
    @FindBy(id = "Password")
    WebElement passwordInput;
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPassword;
    @FindBy (css = ".btn")
    WebElement signInButton;

    public void logIn(String username, String password) {
        usernameInput.sendKeys(username);
        dalejButton.click();
        passwordInput.sendKeys(password);
        signInButton.click();
    }

    public void firstLogSK(String username, int lenght, int lowCas, int uppCas, int digit) {
        passGen.setPassword(passGen.generatePass(lenght,lowCas,uppCas,digit));
        usernameInput.sendKeys(username);
        dalejButton.click();
        passwordInput.sendKeys(passGen.getPassword());
        confirmPassword.sendKeys(passGen.getPassword());
        signInButton.click();
        fileOutput(passGen.getPassword());
    }

//  info o niebezpiecznej stronie
    @FindBy (id= "details-button")
    WebElement detailsButton;
    @FindBy (id = "proceed-link")
    WebElement proceedLink;
//  przełączenie do ramki co nowego
    @FindBy (id = "InlineDialog_Iframe")
    WebElement iFrame;
    @FindBy (xpath = "//*[@id=\"navTourCloseButtonImage\"]/img")
    WebElement closeCoNowego;

    public void loggingNewTab() {
        driver.switchTo().newWindow(WindowType.TAB); // otwiera nową kartę i przełącza się do niej
        driver.get(url);
        logging();
    }

    public void logging() {
        detailsButton.click();
        proceedLink.click();
        driver.switchTo().frame(iFrame);
        closeCoNowego.click();
        driver.switchTo().defaultContent(); // powrót z iframe do strony podstawowej
    }

    public void open() {
        driver.get(url);
        logging();
    }
}
