package SeleniumBasics;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleJQueryDropDown {
	
	static WebDriver driver ;
	
	@Test
	public void Jquerydrpdown() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.jqueryscript.net/demo/Drop-Down-Combo-Tree/");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("justAnInputBox")).click();
		
		//selectbychoiceValue(driver,"choice 1");
		//selectbychoiceValue(driver,"choice 2","choice 2 3","choice 6","choice 6 2 1","choice 6 2");
		selectbychoiceValue(driver,"all");
	}
	
		public static void selectbychoiceValue(WebDriver driver, String...value )
		{
		List<WebElement> choiceList	= driver.findElements(By.xpath("//span[@class='comboTreeItemTitle']"));
		
		if(!value[0].equalsIgnoreCase("all"))
		{
			for(WebElement item:choiceList)
			{
				String text = item.getText();
				for(String val:value)
				{
					if(text.equals(val))
					{
						item.click();
						break;
					}
				}
				
			}
		}
		else
		{
		try {
			for(WebElement item : choiceList)
			{
				item.click();
			}
		}
			catch(Exception e) 
		{
				
			}
			}
			
		}
		}
		
	


