package SeleniumPrograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleCertificate {
	
	static WebDriver driver;
	
	
	@Test
	public void handleCert()
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		cap.setCapability(CapabilityType.ACCEPT_SSL_CERTS, true);
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver(cap);
		driver.get("http://www.cacert.org/");
	}

}
