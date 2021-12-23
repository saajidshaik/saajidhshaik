package in.amazon.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstPage  {

	private static Actions actions;
	//private WebDriverWait wait;
	
	
	@FindBy(id = "twotabsearchtextbox")
	private static WebElement searchbox;

	public FirstPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		actions  = new Actions(driver);
	}

	public static void clicksearchbox() throws InterruptedException {
		searchbox.click();
		searchbox.sendKeys("car perfume");
		Thread.sleep(2000);
		actions.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN)
		.sendKeys(Keys.ENTER).build().perform();
		
		
		// TODO Auto-generated method stub
		
	}
	

}
