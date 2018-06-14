package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ReusableActions {

	WebDriver driver;
	public ReusableActions(WebDriver driver){
		this.driver= driver;
	}
	
	public void waitForTheElementToBeClickable(WebElement element){
		WebDriverWait wait= new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.elementToBeClickable(element));
	}
}
