package SeleniumPrograms;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.ITestResult;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakeScreenshot {
	
	static WebDriver driver;
	
	@Test
	public void Test1()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https:/www.facebook.com/");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("RakshitSaluja");
		
	}

	
	@AfterMethod
	public void Teardown(ITestResult result)
	{
		if(ITestResult.FAILURE == result.getStatus()) {
			CaptureScreenshotUtility(driver, result.getName());
		}
		driver.quit();
	}
	
	
	public void CaptureScreenshotUtility(WebDriver driver , String screenshotname)
	{
		try {
		//	TakesScreenshot ts = (TakesScreenshot)driver;
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyDirectory(source, new File("./Screenshot/"+screenshotname+".png"));
			System.out.println("Screeshot Taken");
		}
		catch(Exception e)
		{
			System.out.println("Exception during taking the screenshot"+e.getMessage());
			e.printStackTrace();
		}
	}

}

	

