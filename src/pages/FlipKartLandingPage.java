package pages;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import testdata.datatotest;

public class FlipKartLandingPage extends BasePage implements datatotest{
	
	public static void searchProduct() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement searchBox = driver.findElement(By.xpath("//input[@name='q']"));
		searchBox.sendKeys(datatotest.product_catagory);
		searchBox.sendKeys(Keys.ENTER);
		
	}
	
	public static void checkLogin() {
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		WebElement loginBtn = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		loginBtn.click();
		WebElement loginID = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		loginID.sendKeys("jojopaul8@gmail.com");
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']")).click();
		
		assertEquals(driver.findElement(By.xpath("//span[@class='_2YULOR']")).getText(), "Please Enter Password", "Password validation text is wrong");
		
		
	}

}
