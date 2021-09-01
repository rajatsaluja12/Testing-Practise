package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Headless {
	
	static WebDriver driver;
	
	@Test
	public void HeadlessChrome()
	{
		WebDriverManager.chromedriver().setup();
		ChromeOptions options = new ChromeOptions();
		options.setHeadless(true);
		driver = new ChromeDriver(options);
		//options.addArguments("--headless");
		driver.get("http://www.cacert.org/");
		System.out.println("The title of the page is : "+driver.getTitle());
		driver.quit();
	}

}
