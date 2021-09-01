package SeleniumBasics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getTextVsgetAttributeValue {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		driver.manage().window().maximize();
		WebElement EEmail = driver.findElement(By.id("Email"));
		
		EEmail.clear();
		EEmail.sendKeys("adm123@gmail.com");
		
		//capturing text from the input box
		System.out.println("Result of getAttribute() method"+ EEmail.getAttribute("value"));
		System.out.println("Result of getText method"+ EEmail.getText());
		
		//login button 
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Log in']"));
		System.out.println(button.getAttribute("type"));
		System.out.println(button.getAttribute("class"));
		System.out.println(button.getText());
		driver.quit();
		
	}

}
