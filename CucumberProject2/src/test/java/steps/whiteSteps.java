package steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import page.basePage;
import page.whitePage;
import util.BrowserFactoryWhite;

public class whiteSteps {
	WebDriver driver;
	
	@Given("^a internal user$")
	public void a_internal_user() throws Throwable {
		String internalAdmin = "abc";
	}

	@When("^admin enters Techfios website$")
	public void admin_enters_Techfios_website() throws Throwable {
		driver = BrowserFactoryWhite.startBrowser();
		
	}

	@And("^ click on  Set white Background $")
	public void clicks_on_Set_white_Background() throws Throwable {
		whitePage WhiteButton = PageFactory.initElements(driver, whitePage.class);
		WhiteButton.click();
	}

	@Then("^admin should see white background$")
	public void admin_should_see_white_background() throws Throwable {
		
		By Whitecolor = By.xpath("//body[@style='background-color: white;']");
		basePage.waitForElement(driver, 10, Whitecolor);
	}
}