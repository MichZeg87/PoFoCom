package template.db.view;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;

import java.time.Duration;

public class GridHeader extends AbstractWebDriver {

    public GridHeader(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    @FindBy(id = "navBarOverlay")
    WebElement nawBar;
    @FindBy(id = "contentIFrame0")
    WebElement iFrame;
    @FindBy(xpath = "//*[@id=]/span[2]")
    WebElement savedView;
    @FindBy(xpath = "//tr[@id='']/td/div[2]/input")
    WebElement searchField;

    public WebElement getiFrame() {
        return iFrame;
    }

    public WebElement getSavedView() {
        return savedView;
    }

    public WebElement getNawBar() {
        return nawBar;
    }

    public void searchValue(String value) {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        nawBar.click();
        driver.switchTo().frame(iFrame);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        searchField.click();
        searchField.sendKeys(value);
        searchField.sendKeys(Keys.ENTER);
    }

    public void viewDropDown() {
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        nawBar.click(); // klik by pojawiła się ramka niezbędny!
        driver.switchTo().frame(iFrame); // tabela jest w ramce wiec trzeba się do niej przełączyć
        savedView.click();
    }

    @FindBy(id = "{}")
    WebElement risk;
    @FindBy(id = "{}")
    WebElement user;
    @FindBy(id = "{}")
    WebElement book;
    @FindBy(id = "{}")
    WebElement inspect;

    public DbView risksTable() {
        viewDropDown();
        risk.click();
        return new DbView(driver, wait);
    }

    public DbView userTable() {
        viewDropDown();
        user.click();
        return new DbView(driver, wait);
    }

    public DbView bookTable() {
        viewDropDown();
        book.click();
        return new DbView(driver, wait);
    }

    public DbView vehicleInspectionTable() throws InterruptedException {
        driver.switchTo().frame(iFrame);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        Thread.sleep(2000);
        savedView.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        inspect.click();
        return new DbView(driver, wait);
    }
}
