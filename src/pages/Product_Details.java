package pages;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Product_Details extends BasePage{
		
	public static void getPrice() {
		//Moving to product details window
		String parentwindow = driver.getWindowHandle();
		Set<String> pages = driver.getWindowHandles();
		
		for(String s : pages) {
			if(parentwindow!=s) {
				driver.switchTo().window(s);
			}
		}
		//get price of the product
		
		WebElement price = driver.findElement(By.xpath("//div[@class='_30jeq3 _16Jk6d']"));
		System.err.println("Price of product: "+price.getText());
		
		
		
	}
}
