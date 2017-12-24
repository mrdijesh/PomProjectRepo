package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class ViewLeads extends ProjectMethods{
	public static String changedCompanyName;
	public static String pageTitle;
	public ViewLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);				
	}
	
	@FindBy(how=How.ID,using="viewLead_firstName_sp")
	private WebElement eleFirstname;
	public ViewLeads verifyFirstName(String expectedText) {
		//verifyPartialText(eleErrorMsg, expectedText);
		verifyExactText(eleFirstname, expectedText);
		return this;
	}
	
	/*public String getTitlePage() {
		pageTitle=getTitle();
		return pageTitle;
	}*/
	public ViewLeads verifyTitlePage(String ExpectedTitle) {
		//verifyPartialText(eleErrorMsg, expectedText);
		verifyTitle(ExpectedTitle);
		return this;
	}
	@FindBy(how=How.XPATH,using="//a[contains(text(),'Edit')]")
	private WebElement eleEditBtn;
	public EditLeads clickEditBtn(){
		click(eleEditBtn);
		return new EditLeads(driver, test);
		
	}
	
	//Getting the value of the the company name
	@FindBy(how=How.ID,using="viewLead_companyName_sp")
	 WebElement eleCompanyName;
	public String getCompanyName() {
		 changedCompanyName=getText(eleCompanyName);
		return changedCompanyName;	
}
	
	public ViewLeads verifyCompanyName(String changedCompanyName) {
		//verifyPartialText(eleErrorMsg, expectedText);
		verifyPartialText(eleCompanyName, changedCompanyName);
		return this;
	}
	
}

