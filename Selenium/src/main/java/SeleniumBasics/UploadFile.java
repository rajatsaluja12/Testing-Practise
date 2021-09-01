package SeleniumBasics;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFile {
	
	static WebDriver driver;
	
	@Test
	public void UploadFileOnWeb() throws AWTException {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.monsterindia.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//span[@class='uprcse semi-bold']")).click();
		
		//using sendkeys
		//driver.findElement(By.xpath("//input[@id='file-upload']")).sendKeys("D:\\Cognizant\\Rakshit_Saluja Resume.docx");
		
		//using Robot Class methods
		WebElement button = driver.findElement(By.xpath("//input[@id='file-upload']"));
		JavascriptExecutor js =  (JavascriptExecutor)driver;
		js.executeScript("arguments[0].click();", button);
		
		
		/*
		 1) Copy the path
		 2) CTRL+V
		 3) Enter
		 */
		
		Robot rb = new Robot();
		rb.delay(2000);
		StringSelection ss = new StringSelection("D:\\Cognizant\\Rakshit_Saluja Resume.docx");
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
		
		//CTRL+V
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		rb.delay(2000);
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_V);
		rb.delay(2000);
		//Enter key
		rb.keyPress(KeyEvent.VK_ENTER);
		rb.keyRelease(KeyEvent.VK_ENTER);
	
	}

}
