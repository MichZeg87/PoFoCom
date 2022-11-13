package template.uat;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class Table extends AbstractWebDriver {

    public Table(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    chooseMenu chooseMenu = new chooseMenu(driver,wait);
    FindValue findValue = new FindValue(driver, wait);

    public Map<Integer, List<String>> mapMenu1() {
        chooseMenu.chooseMenuLM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu11() {
        chooseMenu.chooseMenu1();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu13() {
        chooseMenu.getMenu21Hover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu14() {
        chooseMenu.getMenuaHover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu3() {
        chooseMenu.chooseMenu3();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu32() {
        chooseMenu.getMenuB();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu33() {
        chooseMenu.chooseMenuQ();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu34() {
        chooseMenu.getMenuQ();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu35() {
        chooseMenu.chooseMenu32();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu4() {
        chooseMenu.getMenu6Hover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu41() {
        chooseMenu.chooseMenu6();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu42() {
        chooseMenu.chooseMenu66();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu43() {
        chooseMenu.chooseMenu54();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu44() {
        chooseMenu.chooseMenu65();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu5() {
        chooseMenu.chooseMenuY();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu6() {
        chooseMenu.chooseMenuT();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu71() {
        chooseMenu.chooseMenu21();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu72() {
        chooseMenu.chooseMenu32();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu8() {
        chooseMenu.getMenuH();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu81() {
        chooseMenu.chooseMenuM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu9() {
        chooseMenu.chooseMenuQ();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu91() {
        chooseMenu.chooseMenuM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu92() {
        chooseMenu.chooseMenuL();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu921(){
        chooseMenu.chooseMenuNB();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu922(){
        chooseMenu.chooseMenuSD();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu923(){
        chooseMenu.chooseMenuLM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu924(){
        chooseMenu.chooseMenuJH();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }

    public Map<Integer, List<String>> mapMenu925() {
        chooseMenu.chooseMenuKG();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        findValue.getShow100Row().click();
        return findValue.allTableMapFromSK();
    }
}