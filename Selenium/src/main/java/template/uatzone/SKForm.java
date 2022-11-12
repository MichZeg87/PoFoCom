package template.uatzone;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import java.time.Duration;
import java.util.List;
import java.util.Map;

public class SKForm extends AbstractWebDriver {

    public SKForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    FindValue findValue = new FindValue(driver, wait);
    chooseMenu chooseMenu = new chooseMenu(driver, wait);

    @FindBy (xpath = "/html/body/header/a[3]")
    WebElement breadcrumbUczestnictw;

    public Map<Integer, List<String>> menu11() {
        chooseMenu.getMenu21Hover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(3, 10, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu12(){
        chooseMenu.chooseMenuLM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(3,8, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu13() {
        chooseMenu.chooseMenu1();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(3, 8, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu14() {
        chooseMenu.chooseMenu21();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(3, 8, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu22() {
        chooseMenu.chooseMenuEE();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0, 9, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu23() {
        chooseMenu.chooseMenu2();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0, 10, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu32(){
        chooseMenu.chooseMenuM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(3,8, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu33(){
        chooseMenu.chooseMenu32();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0,9, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu34(){
        chooseMenu.chooseMenuLM();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0,9, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu35(){
        chooseMenu.chooseMenuEE();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(1,6, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu41(){
        chooseMenu.getMenu32Hover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(1,9, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu42(){
        chooseMenu.chooseMenu66();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(1,9, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu43(){
        chooseMenu.chooseMenu6();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0,6, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu44() {
        chooseMenu.chooseMenu54();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0,12, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu45() {
        chooseMenu.chooseMenuY();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0,7, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu51() {
        chooseMenu.chooseMenuT();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0, 10, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu52() {
        chooseMenu.chooseMenuY();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0, 8, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu53() {
        chooseMenu.chooseMenu32();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0, 8, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu61(){
        chooseMenu.getMenu66Hover();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(1,5, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu62() {
        chooseMenu.chooseMenuSD();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(0, 6, findValue.getBreadcrumb());
    }

    public Map<Integer, List<String>> menu71() {
        chooseMenu.chooseMenuQ();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        return findValue.formValuesFromAllRows(2, 4, findValue.getBreadcrumb());
    }

}
