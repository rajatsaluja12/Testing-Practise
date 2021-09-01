package SeleniumPrograms;


import java.util.Set;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SwitchingWindows {

	static WebDriver driver;
	
	@Test
	public void WindowHandleExample() throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com");
		String parent = driver.getWindowHandle();
		System.out.println("Get the parent id"+ parent);
		Set<String> childwindows= driver.getWindowHandles();
		int count = childwindows.size();
		System.out.println("no. of child windows are : "+count);
		for(String Child :childwindows ) {
			if(!parent.equalsIgnoreCase(Child)) {
				driver.switchTo().window(Child);
				System.out.println("Child window title is"+driver.getTitle());
				Thread.sleep(500);
				driver.close();
			}
		}
		driver.switchTo().window(parent);
		System.out.println("you are back to the parent window");
		System.out.println("We will get the title of the page"+ driver.getTitle());
		driver.quit();
		
		
	}
	
	
}
