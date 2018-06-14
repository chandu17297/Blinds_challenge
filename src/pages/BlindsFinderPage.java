package pages;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.ReusableActions;

public class BlindsFinderPage {

	private WebDriver driver;
	ReusableActions ra= new ReusableActions(driver);
	public BlindsFinderPage(WebDriver driver){
		this.driver= driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//button[contains(text(),'Let’s Get Started')]")
	private WebElement letsGetStarted;
	/**
	 * @return the lets Get Started button
	 */
	public WebElement getLetsGetStarted(){
		return letsGetStarted;
	}
	

	@FindBy(xpath="//span[contains(text(),'Yes, I need the room dark, even sometimes during the day')]")
	private WebElement windowCoveringYes;
	/**
	 * @return the window Covering Yes Button
	 */
	public WebElement getwindowCoveringYes(){
		return windowCoveringYes;
	}
	
	@FindBy(xpath="//div[@class='flex items-start justify-start tl mt2 mt4-ns cf']/button")
	private WebElement windowCoveringNext;
	/**
	 * @return the window Covering Next button
	 */
	public WebElement getwindowCoveringNext(){
		return windowCoveringNext;
	}
	
	
	@FindBy(xpath="//span[contains(text(),'No, it’s not that important')]")
	private WebElement heatAndColdNo;
	/**
	 * @return the No Button on insulate against heat and cold
	 */
	public WebElement getHeatAndColdNo(){
		return heatAndColdNo;
	}
	
	@FindBy(xpath="//div[@id='bf-slider']/div/div/div[3]/div/div/section/div[2]/div/button[2]")
	private WebElement heatColdNext;
	/**
	 * @return the Heat Cold Next button
	 */
	public WebElement getHeatColdNext(){
		return heatColdNext;
	}
	
	@FindBy(xpath="//div[@id='bf-slider']/div/div/div[4]/div/div/section/div[2]/label[1]/i")
	private WebElement priceFocused;
	/**
	 * @return the priceFocused radio button
	 */
	public WebElement getPriceFocused(){
		return priceFocused;
	}
	
	@FindBy(xpath="//*[@id='bf-slider']/div/div/div[4]/div/div/section/div[2]/div/button[2]")
	private WebElement bestDescribesYouNext;
	/**
	 * @return the Best Describes You Next button
	 */
	public WebElement getBestDescribesYouNext(){
		return bestDescribesYouNext;
	}
	
	@FindBy(xpath="//section[@id='bf-products']/div[1]/article/div/div[2]/div[1]")
	private WebElement firstblindsRate;
	/**
	 * @return the first blind Rates
	 */
	public WebElement getFirstBlindRate(){
		return firstblindsRate;
	}
	
	@FindAll(@FindBy(xpath="//section[@id='bf-products']/div/article/div/div[2]/div[1]"))
	private List<WebElement> blindsRatesList;
	/**
	 * @return the blinds Rates List
	 */
	public List<WebElement> getBlindsRatesList(){
		return blindsRatesList;
	}
	
	public void searchingCheapBlinds() throws InterruptedException{
		ReusableActions ra= new ReusableActions(driver);
		ra.waitForTheElementToBeClickable(getLetsGetStarted());
		getLetsGetStarted().click();
		ra.waitForTheElementToBeClickable(getwindowCoveringYes());
		getwindowCoveringYes().click();
		ra.waitForTheElementToBeClickable(getwindowCoveringNext());
		getwindowCoveringNext().click();
		Thread.sleep(1000);
		ra.waitForTheElementToBeClickable(getHeatAndColdNo());
		getHeatAndColdNo().click();
		ra.waitForTheElementToBeClickable(getHeatColdNext());
		getHeatColdNext().click();
		ra.waitForTheElementToBeClickable(getPriceFocused());
		getPriceFocused().click();
		Thread.sleep(1000);
		ra.waitForTheElementToBeClickable(getBestDescribesYouNext());
		getBestDescribesYouNext().click();
	}
}
