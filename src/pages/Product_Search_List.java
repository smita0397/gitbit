package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;

import testdata.datatotest;

public class Product_Search_List extends BasePage implements datatotest{

	public static void openProduct() {
		//Scrolling action
		JavascriptExecutor jse = (JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,300)");
		WebElement laptopProduct = driver.findElement(By.xpath("//div[@class='_1YokD2 _3Mn1Gg']/div["+datatotest.product_no+"]"));
		laptopProduct.click();
	}
}
