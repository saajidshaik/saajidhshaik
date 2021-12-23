package in.amazon.tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class BaseTest {
	
WebDriver driver;
	@BeforeClass
	public void launchApplication()
	{
		//1) open the browser
		driver = new ChromeDriver();
		//System.setProperty("Webdriver.chromedriver.driver", "chromedriver.exe");
		
		//2) Maximize it
		driver.manage().window().maximize();
		
		//3)Navigate to application
		driver.get("https://amazon.in");
	}

	//9)close the browser
			@AfterClass
			public void closeBrowser()
			{
				driver.quit();
			}
}
