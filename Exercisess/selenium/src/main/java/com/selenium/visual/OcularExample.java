package com.kodilla.selenium.visual;

import com.testautomationguru.ocular.Ocular;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.nio.file.Paths;

public class OcularExample {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver webDriver= new ChromeDriver();

        Ocular.config()
                .resultPath(Paths.get("c:\\dev\\ocular\\result"))
                .snapshotPath(Paths.get("c:\\dev\\ocular\\snapshot"))
                .globalSimilarity(95)
                .saveSnapshot(true);

        WorldTimePage page = new WorldTimePage(webDriver);
        Thread.sleep(4000);
        page.open();
        page.compare();
        page.close();
    }
}
