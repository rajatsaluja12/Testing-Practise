package testNg_BasicConcept;

import org.testng.annotations.Test;

public class FirstTestCase {


	@Test (priority=1)
	void setup() {
		System.out.println("opening the browser");
	}
	
	@Test(priority=2)
	void Login() {
		System.out.println("Login the browser");
	}
	@Test(priority=3)
	void Teardown() {
		System.out.println("Closing the browser");
	}
	


	
}
