package template.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.utils.AbstractWebDriver;
import template.utils.changeAccount;

public class AdvancedSearch extends AbstractWebDriver {

	public AdvancedSearch(WebDriver driver, WebDriverWait wait) {
		super(driver, wait);
	}

	changeAccount changeAccount = new changeAccount(driver, wait);

	@FindBy(id = "contentIFrame0")
	private WebElement frame;
//	Entity
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity1;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity2;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity3;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity4;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity5;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity6;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity7;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity8;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity9;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity10;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity11;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity12;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity13;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity14;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity15;
	@FindBy(xpath = "//option[. = '']")
	private WebElement entity16;
	@FindBy(xpath = "//option[. = 'entity']")
	private WebElement entity17;
//	view
	@FindBy(xpath = "//option[. = '']")
	private WebElement view1;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view2;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view3;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view4;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view5;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view6;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view7h;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view8;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view9;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view10;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view11;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view12;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view13;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view14;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view15;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view16;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view17;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view18;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view19;
	@FindBy(xpath = "//*[@id=\"AppUserViews\"]/option[4]")
	private WebElement view20;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view21;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view22;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view23;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view24;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view25;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view26;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view27;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view28;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view29;
	@FindBy(xpath = "//option[. = '']")
	private WebElement view30;

	public void toFrame() {
		driver.switchTo().frame(frame);
	}

	public void changeContextEntity(String nazwaKontekstu) {
		entity1.click();
		changeAccount.twoAccounts(3, view1, nazwaKontekstu);
		changeAccount.twoAccounts(3, view2, nazwaKontekstu);
		changeAccount.twoAccounts(2, view9, nazwaKontekstu);
		changeAccount.twoAccounts(4, view13, nazwaKontekstu);
	}

	public void changeContextEntity2(String nazwaKontekstu) {
		entity2.click();
		changeAccount.fourAccountV1(view5, nazwaKontekstu);
		changeAccount.fourAccountV1(view1, nazwaKontekstu);
		changeAccount.twoAccounts(3, view6, nazwaKontekstu);
		changeAccount.twoAccounts(3, view7h, nazwaKontekstu);
		changeAccount.twoAccounts(3, view8, nazwaKontekstu);
	}

	public void changeContextEntity3(String nazwaKontekstu) {
		entity3.click();
		changeAccount.twoAccounts(3, view3, nazwaKontekstu);
		changeAccount.twoAccounts(3, view11, nazwaKontekstu);
		changeAccount.twoAccounts(2, view10, nazwaKontekstu);
		changeAccount.twoAccounts(4, view12, nazwaKontekstu);
	}

	public void changeContextEntity4(String nazwaKontekstu) {
		entity4.click();
		changeAccount.twoAccountsEFE1(0, view14, nazwaKontekstu);
		changeAccount.twoAccountsEFE2(view16, nazwaKontekstu);
		changeAccount.twoAccountsEFE1(0, view19, nazwaKontekstu);
	}

	public void changeContextEntity5(String nazwaKontekstu) {
		entity5.click();
		changeAccount.twoAccountsEFE1(0, view15, nazwaKontekstu);
		changeAccount.twoAccountsEFE1(0, view17, nazwaKontekstu);
		changeAccount.twoAccountsEFE1(0, view18, nazwaKontekstu);
	}

	public void changeContextEntity6(String nazwaKontekstu) {
		entity6.click();
		changeAccount.twoAccounts(2, view21, nazwaKontekstu);
		changeAccount.twoAccounts(2, view22, nazwaKontekstu);
	}

	public void changeContextEntity7(String nazwaKontekstu) {
		entity7.click();
		changeAccount.twoAccounts(2, view20, nazwaKontekstu);
		changeAccount.twoAccounts(1, view23, nazwaKontekstu);
	}

	public void changeContextEntity8(String nazwaKontekstu) {
		entity8.click();
		changeAccount.oneAccount(2, view26, nazwaKontekstu);
		changeAccount.oneAccount(3, view27, nazwaKontekstu);
	}

	public void changeContextEntity9(String nazwaKontekstu) {
		entity9.click();
		changeAccount.oneAccount(2, view29, nazwaKontekstu);
		changeAccount.oneAccount(3, view28, nazwaKontekstu);
	}

	public void changeContextEntity10(String nazwaKontekstu) {
		entity10.click();
		changeAccount.threeAccounts(view25, nazwaKontekstu);
		changeAccount.threeAccounts(view24, nazwaKontekstu);
	}

	public void changeContextEntity16(String nazwaKontekstu) {
		entity16.click();
		changeAccount.fourAccountV2(view25, nazwaKontekstu);
		changeAccount.fourAccountV2(view21, nazwaKontekstu);
		changeAccount.fourAccountV2(view18, nazwaKontekstu);
		changeAccount.twoAccountsEFE1(1, view17, nazwaKontekstu);
	}

	public void changeContextEntity17(String nazwaKontekstu) {
		entity17.click();
		changeAccount.oneAccount(3, view30, nazwaKontekstu);
		changeAccount.oneAccount(3, view2, nazwaKontekstu);
	}

	public void changeContextEntity14(String nazwaKontekstu) {
		entity14.click();
		changeAccount.oneAccount(3, view25, nazwaKontekstu);
		changeAccount.oneAccount(3, view22, nazwaKontekstu);
	}

	public void changeContextEntity81(String nazwaKontekstu) {
		entity8.click();
		changeAccount.oneAccount(2, view26, nazwaKontekstu);
	}

	public void changeContextEntity21(String nazwaKontekstu) {
		entity2.click();
		changeAccount.oneAccount(2, view16, nazwaKontekstu);
	}

	public void changeContextEntity51(String nazwaKontekstu) {
		entity5.click();
		changeAccount.oneAccount(1, view21, nazwaKontekstu);
	}

	public void changeContextEntity101(String nazwaKontekstu) {
		entity10.click();
		changeAccount.oneAccount(1, view7h, nazwaKontekstu);
	}


	public void changeContextEntity82(String nazwaKontekstu) {
		entity8.click();
		changeAccount.oneAccount(3, view22, nazwaKontekstu);
		changeAccount.oneAccount(3, view5, nazwaKontekstu);
		changeAccount.oneAccount(3, view12, nazwaKontekstu);
	}



	public void changeContextEntity121(String nazwaKontekstu) {
		entity12.click();
		changeAccount.oneAccount(4, view22, nazwaKontekstu);
		changeAccount.oneAccount(4, view16, nazwaKontekstu);
		changeAccount.oneAccount(4, view6, nazwaKontekstu);
	}

	public void changeContextEntity13(String nazwaKontekstu) {
		entity13.click();
		changeAccount.oneAccount(4, view2, nazwaKontekstu);
		changeAccount.oneAccount(4, view14, nazwaKontekstu);
		changeAccount.oneAccount(4, view9, nazwaKontekstu);
	}

	public void changeContextEntity141(String nazwaKontekstu) {
		entity14.click();
		changeAccount.accountEFE1(1,view12, nazwaKontekstu);
		changeAccount.accountEFE1(1,view10, nazwaKontekstu);
		changeAccount.accountEFE1(1,view16, nazwaKontekstu);
	}

	public void changeContextEntity142(String nazwaKontekstu) {
		entity14.click();
		changeAccount.accountEFE1(1,view6, nazwaKontekstu);
		changeAccount.accountEFE1(1,view8, nazwaKontekstu);
		changeAccount.accountEFE1(1,view23, nazwaKontekstu);
	}

	public void changeAllAccounts(String nazwaKontekstu) {
		toFrame();
		changeContextEntity(nazwaKontekstu);
		changeContextEntity2(nazwaKontekstu);
		changeContextEntity3(nazwaKontekstu);
		changeContextEntity4(nazwaKontekstu);
		changeContextEntity5(nazwaKontekstu);
		changeContextEntity6(nazwaKontekstu);
		changeContextEntity7(nazwaKontekstu);
		changeContextEntity8(nazwaKontekstu);
		changeContextEntity9(nazwaKontekstu);
		changeContextEntity10(nazwaKontekstu);
		changeContextEntity16(nazwaKontekstu);
		changeContextEntity17(nazwaKontekstu);
		changeContextEntity14(nazwaKontekstu);
		changeContextEntity81(nazwaKontekstu);
		changeContextEntity21(nazwaKontekstu);
		changeContextEntity51(nazwaKontekstu);
		changeContextEntity101(nazwaKontekstu);
		changeContextEntity82(nazwaKontekstu);
		changeContextEntity121(nazwaKontekstu);
		changeContextEntity13(nazwaKontekstu);
		changeContextEntity141(nazwaKontekstu);
		changeContextEntity142(nazwaKontekstu);
	}
}
