package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC003_CreateLeads extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC003";
		testCaseName = "TC003_CreateLeads";
		testDescription = "To create lead";
		category= "Smoke";
		authors	="DJ";
		browserName ="chrome";
	}
	
	
	@Test(dataProvider="fetchData")
	public void createLead(String userName, String passWord, String companyName,String firstName,String lastName,String currencyNname,
			String industry,String ownershipEnum,String verifyFirstNname){
		new LoginPage(driver, test)
		.enterUserName(userName)
		.enterPassword(passWord)
		.clickLogin()
		.clickCrmSfaLink()
		.clickLeads()
		.clickCreateLead()
		.enterCompanyName(companyName)
		.enterFirstName(firstName)
		.enterLastName(lastName)
		.selectCurrency(currencyNname)
		.selectIndustry(Integer.parseInt(industry))
		.selectOwnership(ownershipEnum)
		.clickCreateLeads()
		.verifyFirstName(verifyFirstNname);
		
	}
}
