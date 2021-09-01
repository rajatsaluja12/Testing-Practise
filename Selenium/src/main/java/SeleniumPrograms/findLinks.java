package SeleniumPrograms;

import java.time.Duration;
import java.util.List;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class findLinks {

	static WebDriver driver;
	public static void main(String[] args) throws Exception {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.techbeamers.com/selenium-webdriver-questions/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		List<WebElement> li = driver.findElements(By.tagName("a"));
		System.out.println(li.size());
		for(WebElement e : li) {
			System.out.println(e.getText());
			String ee = e.getAttribute("href");
			System.out.println(ee);
		}
		
		//Launching the batch file in a Selenium Webdriver project
		/*
		 * Process batch = Runtime.getRuntime().exec(""); batch.waitFor();
		 */
		Actions act = new Actions(driver);
		act.dragAndDrop(null, null).build().perform();
		
		Alert alr = driver.switchTo().alert();
		alr.getText();
		
		driver.quit();

	}

}
