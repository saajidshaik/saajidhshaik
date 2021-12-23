package in.amazon.tests;


import org.testng.annotations.Test;

import in.amazon.pages.FirstPage;


public class CarPerfume extends BaseTest {
	
	
	@Test
	public void buycarperfume() throws InterruptedException {
		FirstPage firstpage = new FirstPage(driver);
		FirstPage.clicksearchbox();
		
	}
		

}
