package template.db.grid;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.db.view.GridHeader;
import template.utils.AbstractWebDriver;
import java.time.Duration;

public class viewGrid extends AbstractWebDriver {

    public viewGrid(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }
    GridHeader gridHeader = new GridHeader(driver, wait);

    @FindBy (id = "{}")
    WebElement riskButton;
    @FindBy (id = "{}")
    WebElement vehicleButton;

    public void riskView() {
        gridHeader.viewDropDown();
        riskButton.click();

    }

    public void vehicleView() {
        driver.switchTo().frame(gridHeader.getiFrame());
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(1));
        gridHeader.getSavedView().click();
        vehicleButton.click();
    }

}
