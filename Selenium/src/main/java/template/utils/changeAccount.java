package template.utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import java.util.List;

public class changeAccount extends AbstractWebDriver {

    public changeAccount(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }

    Actions action = new Actions(driver);

    @FindBy(id="contentIFrame0")
    private WebElement frame;
    @FindBy(id="InlineDialog_Iframe")
    private WebElement iframe2;
    @FindBy(id="DialogLoadingDivImg")
    private WebElement loadingFrame;
    @FindBy(xpath="//*[@id=]/tbody/tr/td[1]/div/ul/li")
    private List<WebElement> accountsNr;
    @FindBy(id="btnRemove")
    private WebElement deleteAccounts;
    @FindBy(id="crmGrid_findCriteria")
    private WebElement searchField;
    @FindBy(id="crmGrid_findCriteriaImg")
    private WebElement searchButton;
    @FindBy(id="crmGrid_gridBodyTable_checkBox_Image_All")
    private WebElement chooseRecords;
    @FindBy(id="btnAdd")
    private WebElement chooseButton;
    @FindBy(id="butBegin")
    private WebElement addButton;
    @FindBy(id="Mscrm.AdvancedFind.Groups.View.Save-Large")
    private WebElement save;
	@FindBy(xpath="//img[contains(@id, 'page_R0') and contains(@title, 'Załaduj następną stronę')]")
	private List<WebElement> nextList;
	@FindBy(id="page_R0")
	private WebElement nextButton;
	@FindBy(xpath="//*[@id=\"AppUserViews\"]/option[10]")
	private WebElement search;

    public void addRecord() {
        chooseRecords.click();
        chooseButton.click();
    }

    public void addAcount(String account) {
        driver.switchTo().defaultContent();
        driver.switchTo().frame(iframe2);
        wait.until(ExpectedConditions.invisibilityOf(loadingFrame));
        for (int i = 0; i< accountsNr.size(); i++) {
            int nr = i + 1;
            driver.findElement(By.xpath("//*[@id=]/tbody/tr/td[1]/div/ul/li[" + nr + "]")).click();
        }
        deleteAccounts.click();
        search.click();
        searchField.sendKeys(account);
        searchButton.click();
        addRecord();
        while (!nextList.isEmpty()){
            nextButton.click();
            wait.until(ExpectedConditions.invisibilityOf(loadingFrame));
            addRecord();
        }
        addButton.click();
        driver.switchTo().defaultContent();
        driver.switchTo().frame(frame);
    }

    public void findRecord2(String efe, String fgrp, int ffld, String nazwaKontrahenta) {
        action.moveToElement(driver.findElement(By.id("advFind" + efe + "EFGRP0" + fgrp + "FFLD" + ffld + "CCVALLBL"))).perform();
        driver.findElement(By.id("advFind" + efe + "EFGRP0" + fgrp + "FFLD" + ffld +"CCVALCTL_img")).click();
        addAcount(nazwaKontrahenta);
    }

    public void save() {
        driver.switchTo().defaultContent();
        save.click();
        driver.switchTo().frame(frame);
    }

    public void oneAccount(int ffld, WebElement view, String account) {
        view.click();
        findRecord2("", "", ffld, account);
        save();
    }

    public void accountEFE1(int ffld, WebElement view, String account) {
        view.click();
        findRecord2("EFE1", "", ffld, account);
        save();
    }

    public void twoAccounts(int RP, WebElement view, String account){
        view.click();
        findRecord2("","FGRP" + RP,0, account);
        findRecord2("","FGRP" + RP,1, account);
        save();
    }

    public void twoAccountsEFE2(WebElement view, String account) {
        view.click();
        findRecord2("EFE2","FGRP0",0, account);
        findRecord2("EFE2","FGRP0",1, account);
        save();
    }

    public void twoAccountsEFE1(int rp, WebElement view, String account) {
        view.click();
        findRecord2("EFE1","FGRP" + rp,0, account);
        findRecord2("EFE1","FGRP" + rp,1, account);
        save();
    }

    public void threeAccounts(WebElement view, String account) {
        view.click();
        findRecord2("", "", 2, account);
        findRecord2("EFE1", "FGRP2", 0, account);
        findRecord2("EFE1", "FGRP2", 1, account);
        save();
    }

    public void fourAccountV1(WebElement view, String account) {
        view.click();
        findRecord2("","FGRP2",0, account);
        findRecord2("","FGRP2",1, account);
        findRecord2("EFE1","FGRP0",0, account);
        findRecord2("EFE1","FGRP0",1, account);
        save();
    }

    public void fourAccountV2(WebElement view, String account) {
        view.click();
        findRecord2("EFE1","FGRP3",0, account);
        findRecord2("EFE1","FGRP3",1, account);
        findRecord2("EFE2","FGRP1",0, account);
        findRecord2("EFE2","FGRP1",1, account);
        save();
    }

}
