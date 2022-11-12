package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class GoogleResults extends AbstractPage {

    @FindBy(css= "div[class='g']")
    private List<WebElement> results;
    public GoogleResults(WebDriver driver) {
        super(driver);
        PageFactory.initElements(this.driver, this);
    }

    public void isSeeResults() {
        System.out.println("I see results");
        System.out.println(results.size());
    }

    public void clickRandomElement(){
        Random random = new Random();
        int i = random.nextInt(results.size());
        results.get(i).click();
    }
}
