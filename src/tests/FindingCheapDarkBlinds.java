package tests;

import static org.testng.Assert.assertTrue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

import pages.BlindsFinderPage;
import pages.BlindsHomePage;
import utils.ReusableActions;

public class FindingCheapDarkBlinds {
	WebDriver driver;
	

	public FindingCheapDarkBlinds(){
		
	}
	
	@Test
	public void findingCheapDarkBlinds() throws InterruptedException{
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		driver= new ChromeDriver(); 
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		ReusableActions ra= new ReusableActions(driver);
		BlindsHomePage bhp= new BlindsHomePage(driver);
		ra.waitForTheElementToBeClickable(bhp.getBlindFinder());
		bhp.getBlindFinder().click();
		BlindsFinderPage bfp= new BlindsFinderPage(driver);
		bfp.searchingCheapBlinds();
		ra.waitForTheElementToBeClickable(bfp.getFirstBlindRate());
		ArrayList<Float> rateList=new ArrayList<Float>();
		ArrayList<Float> sortList=new ArrayList<Float>();
		for(WebElement eachRate:bfp.getBlindsRatesList()){
			String rate= eachRate.getText().replace("$", "");
			Float  rate1=Float.parseFloat(rate);
			rateList.add(rate1);
			sortList.add(rate1);
		}
	
		Collections.sort(sortList);
		boolean sorted = sortList.equals(rateList);
		assertTrue(sorted);
	}
	
	@AfterTest
	public void closeBrowser(){
		driver.quit();
	}
}
