package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.SkyblueButtonStepPage;
import page.basePage;
import util.BrowserFactorySkyblue;

public class SBSteps {
	WebDriver driver;
	
	@Given("^a external user$")
	public void a_external_user() throws Throwable {
		String externalUser = "abc";
	}

	@When("^user visits Techfios Site$")
	public void user_visits_Techfios_Test_Page() throws Throwable {
		driver = BrowserFactorySkyblue.startBrowser();
		driver.get( "http://techfios.com/test/101/");
	}

	@And("^ click on  Set Skyblue Background $")
	public void clicks_on_Set_Sky_Blue_Background() throws Throwable {
		SkyblueButtonStepPage SkyBlueButton = PageFactory.initElements(driver, SkyblueButtonStepPage.class);
		SkyBlueButton.click();
	}

	@Then("^home page should change color to skyblue$")
	public void background_color_should_change_to_blue() throws Throwable {
		
		By SkyBlue = By.xpath("//body[@style='background-color: skyblue;']");
		basePage.waitForElement(driver, 10, SkyBlue);
	}
}