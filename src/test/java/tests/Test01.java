/**
 * 
 */
package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 */
public class Test01 {
	
	
	@Test
	void test01() {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		System.out.println("Launched the application");
		System.out.println(driver.getTitle());
		String title="MakeMyTrip USA - #1 Travel Website for Flight Booking, Airline Tickets";
		Assert.assertEquals(driver.getTitle(), title);
		driver.close();
	}

}
