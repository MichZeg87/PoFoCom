package template.uat;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import java.util.*;

public class CheckMenuExist extends AbstractWebDriver {

    public CheckMenuExist(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    Actions action = new Actions(driver);
    String arrowDown = "/a/i[2]";
    @FindBy(xpath = "//nav[@class= 'nav-primary']/ul/li")
    private List<WebElement> menuList;
    Set<String> menuSet = new HashSet<>();
    String xpath = "//nav[@class= 'nav-primary']/ul/li";
    List<WebElement> xpathList = new ArrayList<>();

    public void pause(int millis) {
        try {
            Thread.sleep(millis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void testMenu() {
        int b = 9;
        action.moveToElement(menuList.get(b)).perform();
        pause(300);
        xpathList.addAll(driver.findElements(By.xpath(xpath +"[" +b+ "]/ul/li")));
        if (!xpathList.isEmpty()) {
            xpathList.forEach(a -> {
                action.moveToElement(a).perform();
                pause(300);
                String value = a.getText();
                System.out.println(value);
            });
        }
        System.out.println(xpathList.size());
    }

    public Set<String> checkMenuSet()  {
        for (int i =2; i<= menuList.size(); i++) {
            String xpathMenu = "//nav[@class= 'nav-primary']/ul/li[" +i+ "]";
            menuSet.add(driver.findElement(By.xpath(xpathMenu)).getText().trim().toLowerCase(Locale.ROOT));
            action.moveToElement(driver.findElement(By.xpath(xpathMenu))).perform();
            pause(300);
            List<WebElement> hoverList = driver.findElements(By.xpath(xpathMenu + "/ul/li"));
            for (int j = 1; j <= hoverList.size(); j++) {
                String xpathTab = "/ul/li[" +j+ "]";
                menuSet.add(driver.findElement(By.xpath(xpathMenu + xpathTab)).getText().trim().toLowerCase(Locale.ROOT));
                action.moveToElement(driver.findElement(By.xpath(xpathMenu + xpathTab))).perform();
                List<WebElement> isArrow = driver.findElements(By.xpath(xpathMenu + xpathTab + arrowDown));
                if (!isArrow.isEmpty()){
                    action.moveToElement(driver.findElement(By.xpath(xpathMenu + xpathTab))).perform();
                    pause(300);
                    driver.findElements(By.xpath(xpathMenu + xpathTab+ "/ul/li"))
                            .forEach(s -> menuSet.add(s.getText().trim().toLowerCase(Locale.ROOT)));
                }
            }
        }
        System.out.println(menuSet);
        return menuSet;
    }

    public List<WebElement> getMenuList() {
        return menuList;
    }

}
