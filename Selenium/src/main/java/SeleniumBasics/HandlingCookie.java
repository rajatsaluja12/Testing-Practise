package SeleniumBasics;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandlingCookie {
	
	static WebDriver driver;
	
	@Test
	public void handlingCookies()
	{
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://www.nopcommerce.com/en/demo");
		// How to capture cookies from browser
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println(cookies.size());
		
		//How to print cookies from the browser
		for(Cookie cookie :cookies)
		{
			System.out.println(cookie.getName()+" : "+cookie.getValue());
		}
		
		//how to add cookie 
		Cookie cookieeobj = new Cookie("MyCooki123e","123456");
		driver.manage().addCookie(cookieeobj);
		
		cookies = driver.manage().getCookies();
		System.out.println("size of cookie after adding "+cookies.size());
		
		
		//specific cookie deleting
		//driver.manage().deleteCookie(cookieeobj);
		driver.manage().deleteCookieNamed("MyCooki123e");
		cookies = driver.manage().getCookies();
		System.out.println("size of cookie after deleting "+cookies.size());
		
		//delete all cookie
		driver.manage().deleteAllCookies();
		cookies = driver.manage().getCookies();
		System.out.println("size of cookie after deleting all cookie "+cookies.size());
		
		driver.quit();
		
	}

}
