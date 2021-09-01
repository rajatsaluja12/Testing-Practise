package SeleniumBasics;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown {

	@Test
	public void Ddrowndown() throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.opencart.com/index.php?route=account/register");
		WebElement drpCountryEle = driver.findElement(By.id("input-country"));
		Select drpCountry = new Select(drpCountryEle);
		 drpCountry.selectByVisibleText("Denmark");
		 drpCountry.selectByValue("10");
		 drpCountry.selectByIndex(5);

		// selecting option from dropdown by without using methods

		List<WebElement> allOptions = drpCountry.getOptions();
		allOptions.size();
		for (WebElement option : allOptions) {
			if (option.getText().equals("Cuba")) {
				option.click();
				break;
			}
		}
		
		Thread.sleep(1000);
		driver.close();

	}

}
