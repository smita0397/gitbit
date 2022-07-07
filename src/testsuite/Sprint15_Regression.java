package testsuite;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import pages.BasePage;
import pages.FlipKartLandingPage;
import pages.Product_Details;
import pages.Product_Search_List;

public class Sprint15_Regression extends BasePage{

	@BeforeSuite
	public void startup() {
		//initialization of testsuite
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Tuhin\\Downloads\\Compressed\\chromedriver_win32_4\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.navigate().to("https://www.flipkart.com/");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	}
	
	@Test
	public void loginCheck() {
		FlipKartLandingPage.checkLogin();
	}
	
//	@Test(dependsOnMethods = {"failtest"},alwaysRun = true)
//	public void testSearchFunction() {
//		
//		FlipKartLandingPage.searchProduct(); //step-1
//		Product_Search_List.openProduct(); //step-2
//		Product_Details.getPrice();
//	}
	
	
	
	@AfterSuite
	public void teardown() throws InterruptedException {
		Thread.sleep(5000);
		driver.quit();
	}
	
}
