package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BootStrap_genericDropdropdownmethod {

	static WebDriver driver;
	@Test
	public void bootstrapGenericdrpdown() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.hdfcbank.com/");
		driver.findElement(By.xpath("//div[@class='drp1']//div[@class='dropdown']")).click();
		List<WebElement> productType = driver.findElements(By.xpath("//ul[@class='dropdown1 dropdown-menu']/li"));
		System.out.println("Product size is :"+productType.size());
		selectoptiossnfromdrpdown(productType,"Accounts");
		
		
		List<WebElement> products = driver.findElements(By.xpath("//ul[@class='dropdown2 dropdown-menu']/li"));
		System.out.println("Product size is :"+products.size());
		selectoptiossnfromdrpdown(products, "Savings Accounts");
		}
		
		public static void selectoptiossnfromdrpdown(List<WebElement> options, String value) {
			
			for(WebElement option : options) {
				if(option.getText().equals(value)) {
					option.click();
					break;
				}
			}
		}
		
	}

