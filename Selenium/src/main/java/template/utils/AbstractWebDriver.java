package template.utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.Collection;

public abstract class AbstractWebDriver {
    protected WebDriver driver;
    protected WebDriverWait wait;


    protected AbstractWebDriver(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
        PageFactory.initElements(this.driver, this);
    }

}
