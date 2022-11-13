package template.uat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Grid extends AbstractWebDriver {

    public Grid(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }
    FindValue findValue = new FindValue(driver, wait);
    chooseMenu chooseMenu = new chooseMenu(driver, wait);

    @FindBy (xpath ="//a[contains(@id, '') and not(contains(@class, 'paginate_button next disabled'))]")
    List<WebElement> listButtonNext;
    @FindBy (xpath ="//a[contains(@id, '') and not(contains(@class, 'paginate_button next disabled'))]")
    WebElement buttonNext;
    @FindBy (xpath = "/html/body/div[3]/div/div[1]/div/ul/li[2]")
    WebElement card2;
    @FindBy (xpath = "/html/body/div[3]/div/div[1]/div/ul/li[3]")
    WebElement card3;
    @FindBy (xpath = "/html/body/div[3]/div/div[1]/div/ul/li[4]")
    WebElement card4;
    @FindBy (xpath = "//*[@id=]/tbody/tr[td[not(contains(@title, 'Brak danych'))]]")
    List<WebElement> table1;
    @FindBy (xpath = "//*[@id=]/tbody/tr[td[not(contains(@title, 'Brak danych'))]]")
    List<WebElement> table2;


    public Map<Integer, List<String>> grid1() {
        chooseMenu.getMenuH();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.allRowsGridValue(card4, 9, table1, listButtonNext, buttonNext);
    }

    public Map<Integer, List<String>> grid2() {
        chooseMenu.getMenuZZHover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.allRowsGridValue(card4, 8, table1, listButtonNext, buttonNext);
    }

    public Map<Integer, List<String>> grid3() {
        chooseMenu.chooseMenu54();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.allRowsGridValue(card3, 6, table2, listButtonNext, buttonNext);
    }

}
