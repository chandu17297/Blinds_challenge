package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Testclass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("www.Blinds.com");
		
		/*System.setProperty("webdriver.chrome.driver","C:\\selenium\\chromedriver.exe");
		WebDriver driver= new ChromeDriver(); 
		driver.get("www.Blinds.com");
		System.out.println("done");*/
	}

}
