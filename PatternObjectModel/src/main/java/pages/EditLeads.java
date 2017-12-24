package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class EditLeads extends ProjectMethods {
	public EditLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);		
	
	}

	@FindBy(how=How.ID,using="updateLeadForm_companyName")
	private WebElement eleCompanyName;
	public EditLeads enterCompanyName(String companyName){
		type(eleCompanyName, companyName);
		return this;
	}
	@FindBy(how=How.NAME,using="submitButton")
	private WebElement eleUpdateBtn;
	public ViewLeads clickUpdateBtn(){
		click(eleUpdateBtn);
		return new ViewLeads(driver, test);
	}
	

}
