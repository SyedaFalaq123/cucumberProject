
package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class basePage {
	
	
	
	public static void waitForElement(WebDriver driver, int TimeInSeconds, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, TimeInSeconds);
		wait.until(ExpectedConditions.visibilityOfElementLocated(locator));

}}