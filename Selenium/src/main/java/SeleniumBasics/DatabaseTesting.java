package SeleniumBasics;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DatabaseTesting {

	public static void main(String[] args) throws SQLException {
		
		//Data
		String cust_firstname ="John";
		String cust_lastname ="Kenedy";
		String cust_email ="john@gmail.com";
		String cust_telephone ="123456789";
		String cust_password ="john123";
		
		//user registration 
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("http://localhost/opencart/upload/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[normalize-space()='My Account']")).click();
		driver.findElement(By.xpath("//a[normalize-space()='Register']")).click();
		
		driver.findElement(By.name("firstname")).sendKeys(cust_firstname);
		driver.findElement(By.name("lastname")).sendKeys(cust_lastname);
		driver.findElement(By.name("email")).sendKeys(cust_email);
		driver.findElement(By.name("telephone")).sendKeys(cust_telephone);
		driver.findElement(By.name("password")).sendKeys(cust_password);
		driver.findElement(By.name("confirm")).sendKeys(cust_password);
		driver.findElement(By.name("agree")).click();
		driver.findElement(By.xpath("//input[@value='Continue']")).click();
		String confmsg = driver.findElement(By.xpath("//h1[test()='Your Accpunt Has Been created!']")).getText();
		try {
	
		if(confmsg.equals("Your Account Has been Created!")) {
			System.out.println("Registration successfully from the application");
		}
		else
		{
			System.out.println("Registration not successful");
		}
		
		}catch(Exception e)
		{
			System.out.println("Some Problem in the application");	
		}
		
		//Database validation
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/openshop", "root", "");
		Statement stmt = con.createStatement();
		
		String query = "Select firstname, lastname, email from oc_customer";
		ResultSet rs = stmt.executeQuery(query);
		
		boolean status = false;
		while(rs.next())
		{
			String ffirstname= rs.getString("firstname");
			String llastname= rs.getString("lastname");
			String email= rs.getString("email");
			 
			if(cust_firstname.equals(ffirstname) && cust_lastname.equals(llastname) && cust_email.equals(email))
					{
				System.out.println("Record found in the table || test passed");
				status = true;
				break;
		}
			
		}
		if(status == false)
		{
			System.out.println("Record Not found || test failed");
		}
		}
	}


