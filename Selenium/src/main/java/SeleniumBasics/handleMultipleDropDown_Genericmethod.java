package SeleniumBasics;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class handleMultipleDropDown_Genericmethod {
	
	static WebDriver driver;
	
	@Test
	public void HandleMultipleDropdown() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
	//tradional way
	/*	Select noOfEddmpdDrp = new Select(driver.findElement(By.name("NoOfEmployees")));
		noOfEddmpdDrp.selectByIndex(5);
		Select industrydrp = new Select(driver.findElement(By.name("Industry")));
		industrydrp.selectByVisibleText("ABCD");
		Select countrydrp = new Select(driver.findElement(By.name("Country")));
		countrydrp.selectByValue("55");
		*/
		//Approach 2 - Latest 
		
		WebElement noOFEmployeeDrp = driver.findElement(By.name("NoOfEmployees"));
		selectoptionFromDropdown(noOFEmployeeDrp,"16 - 20");
		WebElement noOFindustrydrp =	driver.findElement(By.name("Industry"));
		selectoptionFromDropdown(noOFindustrydrp,"Healthcare");
		WebElement noOFCountryDrp =	driver.findElement(By.name("Country"));
		selectoptionFromDropdown(noOFCountryDrp,"Ghana");
	}
	
	public static void selectoptionFromDropdown(WebElement ele , String value) {
		Select drp = new Select(ele);
		List<WebElement> allOptions = drp.getOptions();
		allOptions.size();
		for (WebElement option : allOptions) {
			if (option.getText().equals(value)) {
				option.click();
				break;
			}
		}
	}

}
