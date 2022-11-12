package template.uatzone;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;

import java.util.*;

public class SKAllMenus extends AbstractWebDriver {

    public SKAllMenus(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    chooseMenu chooseMenu = new chooseMenu(driver, wait);
    SKTable skTable = new SKTable(driver, wait);
    FindValue wartosci = new FindValue(driver, wait);

    public Map<String, Collection<List<String>>> getMenuMap() {
        return menuMap;
    }

    Map<String, Collection<List<String>>> menuMap = new HashMap<>();

    public Map<String, Collection<List<String>>> allTables() {
        chooseMenu.chooseMenuY();
        wartosci.skWait();
        String name = driver.findElement(By.xpath("//div[3]/div/div[1]/div[2]/div/ul/li/a")).getText();
        menuMap.put(name.toLowerCase(Locale.ROOT), skTable.mapMenu5().values());
        return menuMap;
    }

}
