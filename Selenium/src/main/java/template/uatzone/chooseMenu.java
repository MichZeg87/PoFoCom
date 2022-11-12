package template.uatzone;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import template.utils.AbstractWebDriver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class chooseMenu extends AbstractWebDriver {

    List<WebElement> list = new ArrayList<>();

    WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(2));

    public chooseMenu(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    Actions action = new Actions(driver);
	@FindBy(id="pc_home_menu")
	private WebElement home;
    @FindBy(css = "#" )
    WebElement menuP;
    @FindBy (id = "")
    WebElement menu1yHover;
    @FindBy (id = "")
    WebElement menu2Hover;
    @FindBy (id = "")
    WebElement menu3Hover;
    @FindBy (id = "")
    WebElement menuA;
    @FindBy (id = "")
    WebElement menuB;
    @FindBy (id = "")
    WebElement menuC;
    @FindBy (id = "")
    WebElement menuD;
    @FindBy (id = "")
    WebElement menu4Hover;
    @FindBy (id = "")
    WebElement menuE;
    @FindBy (id = "")
    WebElement menuF;
    @FindBy (id = "")
    WebElement menuH;
    @FindBy (id = "")
    WebElement menu6Hover;
    @FindBy (id = "")
    WebElement menu66Hover;
    @FindBy (id = "")
    WebElement menu54Hover;
    @FindBy (id="")
    WebElement menu65Hover;
    @FindBy (id="")
    WebElement menuY;
    @FindBy (id="")
    WebElement menuT;
    @FindBy (id = "")
    WebElement menuEE;
    @FindBy (id = "")
    WebElement menu21Hover;
    @FindBy (id = "")
    WebElement menu32Hover;
    @FindBy (id = "")
    WebElement menuaHover;
    @FindBy (id = "")
    WebElement menuZZHover;
    @FindBy (id = "")
    WebElement menuDA;
    @FindBy (id = "")
    WebElement menu25Hover;
    @FindBy (id = "")
    WebElement menuQ;
    @FindBy (id = "")
    WebElement menuM;
    @FindBy (id = "")
    WebElement menuL;
    @FindBy (id = "")
    WebElement menuPO;
    @FindBy (id = "")
    WebElement menuPI;
    @FindBy (id = "")
    WebElement menuLM;
    @FindBy (id = "")
    WebElement menuNB;
    @FindBy (id = "")
    WebElement menuSD;
    @FindBy (id="")
    WebElement menuJH;
    @FindBy (id = "")
    WebElement menuKG;

    public void chooseMenu1() {
        action.moveToElement(menuP).perform();
        wait.until(ExpectedConditions.visibilityOf(menu1yHover));
        menu1yHover.click();
    }

    public void chooseMenu2() {
        action.moveToElement(menuA).perform();
        wait.until(ExpectedConditions.visibilityOf(menuC));
        menuC.click();
    }

    public void chooseMenu6() {
        action.moveToElement(menuH).perform();
        wait.until(ExpectedConditions.visibilityOf(menu6Hover));
        menu6Hover.click();
    }

    public void chooseMenu66() {
        action.moveToElement(menuH).perform();
        wait.until(ExpectedConditions.visibilityOf(menu66Hover));
        menu66Hover.click();
    }

    public void chooseMenu54() {
        action.moveToElement(menuH).perform();
        wait.until(ExpectedConditions.visibilityOf(menu54Hover));
        menu54Hover.click();
    }

    public void chooseMenu65() {
        action.moveToElement(menuH).perform();
        wait.until(ExpectedConditions.visibilityOf(menu65Hover));
        menu65Hover.click();
    }

    public void chooseMenuY() {
        menuY.click();
    }

    public void chooseMenuT() {
        menuT.click();
    }

    public SKTable chooseMenuEE() {
        menuEE.click();
        return new SKTable(driver, wait);
    }

    public void chooseMenu21() {
        action.moveToElement(menuEE).perform();
        wait.until(ExpectedConditions.visibilityOf(menu21Hover));
        menu21Hover.click();
    }

    public void chooseMenu32() {
        action.moveToElement(menuEE).perform();
        wait.until(ExpectedConditions.visibilityOf(menu32Hover));
        menu32Hover.click();
    }

    public SKTable chooseMenu3() {
        action.moveToElement(menuEE).perform();
        wait.until(ExpectedConditions.visibilityOf(menuaHover));
        menuaHover.click();
        return new SKTable(driver, wait);
    }

    public SKTable chooseMenuZZ() {
        action.moveToElement(menuEE).perform();
        wait.until(ExpectedConditions.visibilityOf(menuZZHover));
        menuZZHover.click();
        return new SKTable(driver, wait);
    }



    public void chooseMenuQ() {
        menuQ.click();
    }

    public void chooseMenuM() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuM));
        menuM.click();
    }

    public void chooseMenuL() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        menuL.click();
    }

    public void chooseMenuLM() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuM));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuM).perform();
        menuLM.click();
    }

    public void chooseMenuNB() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuL).perform();
        menuNB.click();
    }

    public void chooseMenuSD() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuL).perform();
        menuSD.click();
    }

    public void chooseMenuJH() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuL).perform();
        menuJH.click();
    }

    public void chooseMenuKG() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuL).perform();
        menuKG.click();
    }

    public List<WebElement> home() {
        list.add(home);
        return list;
    }

    public List<WebElement> getMenu3Hover() {
        action.moveToElement(menuP).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu3Hover));
        list.add(menu3Hover);
        return list;
    }

    public List<WebElement> getMenuA() {
        list.add(menuA);
        return list;
    }

    public List<WebElement> getMenuB() {
        action.moveToElement(menuA).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuB));
        list.add(menuB);
        return list;
    }

    public List<WebElement> getMenuC() {
        action.moveToElement(menuA).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuC));
        list.add(menuC);
        return list;
    }
    public List<WebElement> getMenuH() {
        list.add(menuH);
        return list;
    }

    public List<WebElement> getMenu6Hover() {
        action.moveToElement(menuH).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu6Hover));
        list.add(menu6Hover);
        return list;
    }

    public List<WebElement> getMenu66Hover() {
        action.moveToElement(menuH).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu66Hover));
        list.add(menu66Hover);
        return list;
    }

    public List<WebElement> getMenu54Hover() {
        action.moveToElement(menuH).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu54Hover));
        list.add(menu54Hover);
        return list;
    }

    public List<WebElement> getMenu65Hover() {
        action.moveToElement(menuH).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu65Hover));
        list.add(menu65Hover);
        return list;
    }

    public List<WebElement> getListPodmiotyZalezne() {
        list.add(menuY);
        return list;
    }

    public List<WebElement> getListKlienci() {
        list.add(menuT);
        return list;
    }

    public List<WebElement> getMenuEE() {
        list.add(menuEE);
        return list;
    }

    public List<WebElement> getMenu21Hover() {
        action.moveToElement(menuEE).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu21Hover));
        list.add(menu21Hover);
        return list;
    }

    public List<WebElement> getMenu32Hover() {
        action.moveToElement(menuEE).perform();
        wait1.until(ExpectedConditions.visibilityOf(menu32Hover));
        list.add(menu32Hover);
        return list;
    }

    public List<WebElement> getMenuaHover() {
        action.moveToElement(menuEE).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuaHover));
        list.add(menuaHover);
        return list;
    }

    public List<WebElement> getMenuZZHover() {
        action.moveToElement(menuEE).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuZZHover));
        list.add(menuZZHover);
        return list;
    }

    public List<WebElement> getMenuQ() {
        list.add(menuQ);
        return list;
    }

    public List<WebElement> getMenuM() {
        action.moveToElement(menuQ).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuM));
        list.add(menuM);
        return list;
    }

    public List<WebElement> getMenuL() {
        return list;
    }

    public List<WebElement> getMenuPO() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        list.add(menuL);
        return list;
    }

    public List<WebElement> getMenuNB() {
        action.moveToElement(menuQ).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuL));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuL).perform();
        wait1.until(ExpectedConditions.visibilityOf(menuNB));
        list.add(menuNB);
        return list;
    }

    public List<WebElement> getMenuKG() {
        action.moveToElement(menuQ).perform();
        wait.until(ExpectedConditions.visibilityOf(menuL));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        action.moveToElement(menuL).perform();
        menuKG.click();
        return list;
    }
}
