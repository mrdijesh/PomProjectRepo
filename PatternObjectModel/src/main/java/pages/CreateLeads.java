package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class CreateLeads extends ProjectMethods {
	
	public CreateLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(how=How.ID,using="createLeadForm_companyName")
	private WebElement eleCompanyName;
	
	public CreateLeads enterCompanyName(String CName) {
		type(eleCompanyName, CName);
		return this;
		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_firstName")
	private WebElement eleFirstName;
	
	public CreateLeads enterFirstName(String fName) {
		type(eleFirstName, fName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_lastName")
	private WebElement eleLastName;
	public CreateLeads enterLastName(String lName) {
		type(eleLastName, lName);
		return this;		
	}
	
	
	@FindBy(how=How.ID,using="createLeadForm_currencyUomId")
	private WebElement eleCurrencyUomId;
	public CreateLeads selectCurrency(String currencyName) {
		
		selectDropDownUsingText(eleCurrencyUomId, currencyName);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_industryEnumId")
	private WebElement eleIndustryEnumId;
	public CreateLeads selectIndustry(int industryIndex) {
		
		selectDropDownUsingIndex(eleIndustryEnumId, industryIndex);
		return this;		
	}
	
	@FindBy(how=How.ID,using="createLeadForm_ownershipEnumId")
	private WebElement eleOwnershipEnumId;
	public CreateLeads selectOwnership(String ownershipName) {
		
		selectDropDownUsingText(eleOwnershipEnumId, ownershipName);
		return this;		
	}
	
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleCreateLeadsBtn;
	public ViewLeads clickCreateLeads() {
		click(eleCreateLeadsBtn);
		return new ViewLeads(driver, test);
	}
	

}
