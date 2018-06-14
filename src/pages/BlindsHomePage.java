package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BlindsHomePage {

	private WebDriver driver;
	
	public BlindsHomePage(WebDriver driver){
		this.driver= driver;
		driver.get("http://www.Blinds.com");
		driver.manage().window().maximize();
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//a[contains(text(),'Start Searching')]")
	private WebElement blindFinder;
	/**
	 * @return the Blind-Finder search button
	 */
	public WebElement getBlindFinder(){
		return blindFinder;
	}
	
	
}
