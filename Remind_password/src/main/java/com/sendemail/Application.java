package com.sendemail;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.concurrent.TimeUnit;
import org.junit.*;

public class Application {

    public String sendEmailToUser(String urlStrefy, String email) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        WebDriverWait wait = new WebDriverWait(driver, 30);
        driver.get(urlStrefy + "/logowanie.aspx");
        driver.manage().window().maximize();
        driver.findElement(By.xpath("//a[contains(text(),'formularza przypominania hasła')]")).click();
        driver.findElement(By.xpath("//*[@id=\"Email\"]")).sendKeys(email);
        driver.findElement(By.xpath("//*[@id=\"remindPasswordButton\"]")).click();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By
                .xpath("/html/body/header/h1")));
        Assert.assertEquals(driver.findElement(By.xpath("/html/body/header/h1")).getText(), "Odbierz email aby zmienić hasło.");
        driver.quit();
        return "Email zostął wysłany";
    }
}
