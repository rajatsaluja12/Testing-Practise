package SeleniumPrograms;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrokenLinks {
	
	static WebDriver driver;
	
	@Test
	public void brokenlinks() throws InterruptedException, IOException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);		
		driver.get("https://www.naukri.com");
		Thread.sleep(500);
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println(links.size());
		for(int i=0; i<links.size();i++) {
			
			WebElement element = links.get(i);
			String url = element.getAttribute("href");
			URL link = new URL(url);
			HttpURLConnection httpConn = (HttpURLConnection)link.openConnection();
			int rescode = httpConn.getResponseCode();
			
			if(rescode >= 400) {
				System.out.println(url+"-- "+"It is a broken link");
			}else {
				System.out.println(url+"-- "+"It is a not broken link");
			}
			
		}
	}

}
