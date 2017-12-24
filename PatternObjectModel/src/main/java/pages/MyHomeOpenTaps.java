package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.relevantcodes.extentreports.ExtentTest;

import wdMethods.ProjectMethods;


public class MyHomeOpenTaps extends ProjectMethods{

	public MyHomeOpenTaps(RemoteWebDriver driver,ExtentTest test) {
		this.driver = driver;
		this.test = test;

		PageFactory.initElements(driver, this);		

	}


	@FindBy(how=How.LINK_TEXT,using="Leads")
	private WebElement eleLeads;
	public MyLeads clickLeads()
	{
		click(eleLeads);

		return new MyLeads(driver, test);
	}

}
