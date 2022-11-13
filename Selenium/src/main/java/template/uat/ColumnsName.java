package template.uat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import java.time.Duration;
import java.util.List;

public class ColumnsName extends AbstractWebDriver {

    chooseMenu chooseMenu = new chooseMenu(driver, wait);
    FindValue findValue = new FindValue(driver,wait);
    Grid grid = new Grid(driver, wait);

    @FindBy (xpath = "//*[@id=]/thead/tr/th")
    List<WebElement> listGridColumnName1;
    @FindBy (xpath = "//*[@id=]/thead/tr/th")
    List<WebElement> listGridColumnName2;

    public ColumnsName(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    public List<String> menu2() {
        chooseMenu.chooseMenu1();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.tableHeaderList(findValue.getSkHeader(), 1,2);
    }

    public List<String> menu51(){
        chooseMenu.chooseMenuNB();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.tableHeaderList(findValue.getSkHeader(), 1,2);
    }

    public List<String> menu52(){
        chooseMenu.chooseMenuSD();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.tableHeaderList(findValue.getSkHeader(), 1,2);
    }

    public List<String> formGrid2() {
        chooseMenu.chooseMenuM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.addGridHeaderToList(grid.card4, 9, listGridColumnName2, 1);
    }


}

