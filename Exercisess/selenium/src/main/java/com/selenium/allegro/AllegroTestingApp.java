package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.Allegro.pl");
        driver.findElement(By.xpath("//*[@class=\"_9f0v0 _jkrtd mj7a_0 mh36_16 mvrt_16 mg9e_16 mpof_ki m389_6m munh_56 m3h2_56 myre_zn myre_8v_s m7f5_5x_s mjru_vb _90605_OPWNL\"]/button")).click();

        WebElement categoryCombo = driver.findElement(
                By.xpath("//*[@class=\"mp7g_oh mr3m_1 _r65gb\"]/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

        WebElement inputField = driver.findElement(By.xpath("//*[@class=\"mp4t_8 mp4t_0_l mryx_8 mryx_0_s m7er_k4 _13850_O2svT\"]/div/div/form/input"));
        inputField.sendKeys("Mavic mini");
        driver.findElement(By.xpath("//*[@class=\"mp4t_8 mp4t_0_l mryx_8 mryx_0_s m7er_k4 _13850_O2svT\"]/div/div/form/button")).click();


    }
}
