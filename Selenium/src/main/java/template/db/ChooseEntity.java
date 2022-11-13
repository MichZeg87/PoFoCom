package template.db;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.db.view.DbView;
import template.db.view.GridHeader;
import template.utils.AbstractWebDriver;
import java.time.Duration;

public class ChooseEntity extends AbstractWebDriver {

    public ChooseEntity(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    ExpectedCondition<Boolean> loadingLocator = ExpectedConditions
            .invisibilityOfElementLocated(By.id("loading"));

    @FindBy (xpath = "//*[@class= 'navTabButton navTabButtonRight SubAreaNodePadding']")
    WebElement workplace;
    @FindBy (xpath = "//*[@id=\"SFA\"]/span[2]")
    WebElement SFA;
    @FindBy (id = "")
    WebElement CZ;
    @FindBy (id = "")
    WebElement data;
    @FindBy (id = "")
    WebElement workbench;

    public ChooseEntity chooseSFA() {
        workplace.click();
        SFA.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return this;
    }

    public ChooseEntity chooseWorkSpace() {
        workplace.click();
        data.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return this;
    }

    public ChooseEntity chooseCZ() {
        workplace.click();
        CZ.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return this;
    }

    public ChooseEntity choseWorkbench() {
        workplace.click();
        workbench.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return this;
    }

    @FindBy (xpath = "//div[contains(@id, 'detailActionGroupControl_rightNavContainer')]/a")
    WebElement rightNav;
    @FindBy (id = "")
    WebElement looses;
    @FindBy (id = "")
    WebElement totalLooses;
    @FindBy (id = "")
    WebElement decisions;
    @FindBy (id = "nav_accts")
    WebElement account;
    @FindBy (id = "nav_conts")
    WebElement user;
    @FindBy (id = "")
    WebElement risks;
    @FindBy (id = "")
    WebElement vehicles;
    @FindBy (id = "")
    WebElement payments;
    @FindBy (id = "")
    WebElement contracts;
    @FindBy (id = "")
    WebElement templates;
    @FindBy (id = "")
    WebElement notification;


    public GridHeader entity1() {
        chooseWorkSpace();
        totalLooses.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new GridHeader(driver, wait);
    }

    public GridHeader entity2() {
        chooseWorkSpace();
        decisions.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new GridHeader(driver, wait);
    }

    public GridHeader entity3() {
        chooseSFA();
        account.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new GridHeader(driver, wait);
    }

    public GridHeader entity4() {
        chooseSFA();
        user.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new GridHeader(driver, wait);
    }

    public DbView entity5() {
        chooseSFA();
        payments.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new DbView(driver, wait);
    }

    public DbView entity6() {
        chooseSFA();
        risks.click();
        wait.until(loadingLocator); // czeka aż lading zniknie
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new DbView(driver, wait);
    }

    public DbView entity7(){
        chooseSFA();
        vehicles.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new DbView(driver, wait);
    }

    public DbView entity8(){
        chooseSFA();
        contracts.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new DbView(driver, wait);
    }

    public GridHeader entity9(){
        chooseCZ();
        templates.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new GridHeader(driver, wait);
    }

    public GridHeader entity10(){
        chooseCZ();
        notification.click();
        wait.until(loadingLocator);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
        return new GridHeader(driver, wait);
    }

}