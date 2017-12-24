package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;

public class MyLeads extends ProjectMethods{
	
	public MyLeads(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;
				
		PageFactory.initElements(driver, this);		
	
	}
	
	
	@FindBy(how=How.LINK_TEXT,using="Create Lead")
	private WebElement eleCreateLead;
	public CreateLeads clickCreateLead()
	{
		click(eleCreateLead);
		
		return new CreateLeads(driver, test);
	}
	
	//Clicking Find lead link 
		@FindBy(how=How.LINK_TEXT,using="Find Leads")
		private WebElement eleFindLeads;
		public MyLeads clickFindLeads()
		{
			click(eleFindLeads);
			return this;
		}

		@FindBy(how=How.XPATH,using="(//input[@name='firstName'])[3]")
		private WebElement eleFirstNameTextBox;
		public MyLeads enterfirstName(String fname){
			type(eleFirstNameTextBox, fname);
			return this;
		}

		@FindBy(how=How.XPATH,using="//button[text()='Find Leads']")
		private WebElement eleFindLeadsBtn;
		public MyLeads clickFindLeadsBtn(){
			click(eleFindLeadsBtn);
			return this;
		}

		@FindBy(how=How.XPATH,using="(//a[@class='linktext'])[4]")
		private WebElement eleLinkTestLeadID;
		public ViewLeads clickLinkTestLeadID(){
		click(eleLinkTestLeadID);
		return new ViewLeads(driver, test);

		}
}
