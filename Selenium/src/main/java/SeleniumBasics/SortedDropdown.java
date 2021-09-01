package SeleniumBasics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SortedDropdown {
	
	static WebDriver driver;
	
	@Test
	public void SortedDrpdown()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.twoplugs.com");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[text()='Live Posting']")).click(); // Live posting 
	WebElement drpElement = driver.findElement(By.name("category_id"));
	Select drpSelect = new Select(drpElement);
	drpSelect.getOptions();
	List<WebElement> options = drpSelect.getOptions();
	
	ArrayList originalList = new ArrayList();
	ArrayList templist = new ArrayList();
	
	for(WebElement option : options)
	{
		originalList.add(option.getText());
		templist.add(option.getText());
	}
	Collections.sort(templist);
		driver.quit();
		
		
	}

}
