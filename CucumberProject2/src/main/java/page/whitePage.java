package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class whitePage {
	WebDriver driver; // Global

	// constructor to invite the driver

	public whitePage(WebDriver driver) {
		this.driver = driver;
	}

	// Element Library

	@FindBy(how = How.XPATH, using = "//button[contains(text(), 'Set White Background')]")
	WebElement WhiteButton;
	
	// Methods to interact with the elements

	public void Highlight(String driver, String WhiteButton) throws InterruptedException {
		Highlight(driver, WhiteButton);
		Thread.sleep(3000);

	}

	public void ModifyBCSkyBlue() {
		// TODO Auto-generated method stub
		WhiteButton.click();
	}

	public void click() {
		WhiteButton.click();

	}

}
