package template.db.form;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.db.view.GridHeader;
import template.utils.AbstractWebDriver;

public class ViewForForm extends AbstractWebDriver {

    public ViewForForm(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }
    protected GridHeader gridHeader = new GridHeader(driver, wait);

    @FindBy (id = "{}")
    WebElement userLabel;
    @FindBy (id = "{}")
    WebElement inspectionLabel;

    public void user() {
        gridHeader.viewDropDown();
        userLabel.click();
    }

    public void vehicleInspection() throws InterruptedException {
        driver.switchTo().frame(gridHeader.getiFrame());
        Thread.sleep(2000);
        gridHeader.getSavedView().click();
        Thread.sleep(2000);
        inspectionLabel.click();
    }
}
