package sample;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Automationpractice {

	public static void main(String[] args) {
	
		 WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/automation-practice-form");
		driver.findElement(By.xpath("//div[@class='col-md-9 col-sm-12']/input[@id='userEmail']")).sendKeys("Rakshitsaluja21");
		
		
		

	}

}
