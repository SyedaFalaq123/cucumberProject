package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class SkyblueButtonStepPage {
	WebDriver driver; // Global

	// constructor to invite the driver

	public SkyblueButtonStepPage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set SkyBlue Background')]")
	WebElement SkyBlueButton;
	// SBB=skybluebutton
	// Methods to interact with the elements

	public void Highlight(String driver, String SBButton) throws InterruptedException {
		Highlight(driver, SBButton);
		Thread.sleep(3000);

	}

	public void ModifyBCSkyBlue() {
		// TODO Auto-generated method stub
		SkyBlueButton.click();
	}

	public void click() {
		SkyBlueButton.click();

	}

}
