package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingAppCss {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");
//        driver.findElement(By.cssSelector("#gdpr-banner-accept")).click();

        WebElement categoryCombo = driver.findElement(
                By.cssSelector("#gh-cat"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(12);

        WebElement inputField = driver.findElement(By.cssSelector("#gh-ac"));
        inputField.sendKeys("Mavic mini");
        driver.findElement(By.cssSelector("#gh-btn")).click();
        WebDriverWait wait = new WebDriverWait(driver, 20);
        Thread.sleep(3000);
        List<WebElement> element = driver.findElements(By.xpath("/html/body/div[5]/div[5]/div[2]/div[1]/div[2]/ul/li"));
        element.get(0).getText();
        String result = element.get(0).findElement(By.tagName("h3")).getText();
        System.out.println(element.size());
        System.out.println(result);


    }
}
