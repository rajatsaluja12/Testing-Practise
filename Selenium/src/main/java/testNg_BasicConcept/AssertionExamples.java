package testNg_BasicConcept;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AssertionExamples {
	
	@Test
	void launchBrowser()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.adaface.com/blog/cucumber-interview-questions/");
		String ttle = driver.getTitle();
		Assert.assertEquals("adaface",ttle);
		
	}

}
