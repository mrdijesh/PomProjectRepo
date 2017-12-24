package testcases;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pages.LoginPage;
import wdMethods.ProjectMethods;

public class TC004_EditLead extends ProjectMethods {
	
	@BeforeClass
	public void setData() {
		dataSheetName = "TC004";
		testCaseName = "TC004_EditLeads";
		testDescription = "To Edit lead";
		category= "Smoke";
		authors	="DJ";
		browserName ="chrome";
	}
	
	
	@Test(dataProvider="fetchData")
	public void editLead(String userName, String passWord, String firstName,String pageTitle,String companyName,String changedCompanyName ){
	new LoginPage(driver, test)
	.enterUserName(userName)
	.enterPassword(passWord)
	.clickLogin()
	.clickCrmSfaLink()
	.clickLeads()
	.clickFindLeads()
	.enterfirstName(firstName)
	.clickFindLeadsBtn()
	.clickLinkTestLeadID()
	.verifyTitlePage(pageTitle)
	.clickEditBtn()
	.enterCompanyName(companyName)
	.clickUpdateBtn()
	.verifyCompanyName(changedCompanyName);
	
	}
	}

