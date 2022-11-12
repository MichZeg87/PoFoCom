package template.crm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import template.Logging;
import template.crm.form.CRMForm;
import template.crm.grid.CRMGrid;
import template.crm.view.CRMView;
import template.crm.view.GridHeader;
import template.utils.AbstractWebDriver;
import template.utils.FindValue;
import template.utils.Variables;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CrmAllTables extends AbstractWebDriver {

    public CrmAllTables(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
        PageFactory.initElements(this.driver, this);
    }

    ContactAccessRole crmMenu = new ContactAccessRole(driver, wait);
    FindValue findValue = new FindValue(driver, wait);
    Logging logging = new Logging(driver,wait);
    ChooseEntity chooseEntity = new ChooseEntity(driver, wait);
    GridHeader gridHeader = new GridHeader(driver, wait);
    CRMView crmView = new CRMView(driver, wait);
    CRMGrid crmGrid = new CRMGrid(driver, wait);
    CRMForm crmForm = new CRMForm(driver, wait);

    Map<String, Collection<List<String>>> entityMap = new HashMap<>();

    public Map<String, Collection<List<String>>> getEntityMap() {
        return entityMap;
    }

    public Map<Integer, List<String>> gridRiskMap() throws InterruptedException{
        Thread.sleep(2000);
        crmGrid.activeRisk();
        return findValue.allTableMapFromCrm(new Variables(100,100, 5,1,100
                ,100,100,100,100));
    }

    public Map<String, Collection<List<String>>> viewBookMap()throws InterruptedException {
        if (crmMenu.getMenu().contains("")) {
            Thread.sleep(2000);
            gridHeader.bookTable();
            entityMap.put("", findValue.allTableMapFromCrm(crmView.neutral).values());
            return entityMap;
        } else {
            return Collections.emptyMap();
        }
    }


    public Map<String, Collection<List<String>>> formInspectTable() throws InterruptedException{
        if (crmMenu.getMenu().contains("")) {
        Thread.sleep(2000);
        crmForm.inspectionsToBePerformed();
            entityMap.put("", findValue.allTableMapFromCrm(crmView.insp).values());
            return entityMap;
        } else {
            return Collections.emptyMap();
        }
    }

    public Map<String, Collection<List<String>>> userFormMap() throws InterruptedException {
        if (crmMenu.getMenu().contains("")) {
            Thread.sleep(2000);
            crmForm.activeUser();
           entityMap.put("", findValue.allTableMapFromCrm(new Variables(
                   5, 100, 100, 1, 100, 100, 100, 100, 100)).values());
            return entityMap;
        } else {
            return Collections.emptyMap();
        }
    }


    public Map<Integer, List<String>> vehicleGrddMap() throws InterruptedException{
        if (crmMenu.getMenu().contains("")) {
            Thread.sleep(2000);
           crmGrid.activeVehicle();
            return findValue.allTableMapFromCrm(crmView.book);
        }else {
            return Collections.emptyMap();
        }
    }

    public Map<String, Collection<List<String>>> addEntitiesToMap() throws InterruptedException {
        crmMenu.crmMenuChecker("");
        driver.switchTo().defaultContent();
        chooseEntity.entity3();
        gridHeader.getNawBar().click();
        driver.switchTo().frame(2);
        gridRiskMap();
        viewBookMap();
        userFormMap();
        formInspectTable();
        vehicleGrddMap();
        return entityMap;
    }
}
