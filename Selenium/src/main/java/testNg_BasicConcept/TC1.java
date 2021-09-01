package testNg_BasicConcept;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class TC1 {
	
	// @BeforeSuit
	//@BeforeTest
	//@BeforeClass
	//BeforeMethod
	//@Test1
	//AfterMethod 		// Here if you have multiple @Test , then we will be executing @Test with pair of @beforemethod and @AfterMethod
	//BeforeMethod
	//@Test2
	//AfterMethod
	// @AfterClass
	//@BeforeTest
	//@BeforeSuite
	@BeforeClass
	void BeforeClass()
	{
		System.out.println("It should be executed only once before Class");
	}
	
	@AfterClass
	void AfterClassd()
	{
		System.out.println("It should be executed only oncee after class");
	}
	
	@BeforeMethod
	void BeforeMethod()
	{
		System.out.println("It should be executed before every method");
	}
	
	@AfterMethod
	void AftereMethod()
	{
		System.out.println("It should be executed after every method");
	}
	
	@Test
	void test1()
	{
		System.out.println("This is test1...");
	}

	@Test
	void test2()
	{
		System.out.println("This is test2...");
	}
	

}
