package testNg_BasicConcept;

import org.testng.annotations.Test;

public class PriorityExample {
	
	@Test(priority = 0)
	void TestOne()
	{
		System.out.println("This is the first test");
	}
	
	@Test(priority = 1)
	void TestTwo()
	{
		System.out.println("This is the Second test");
	}
	
	@Test(priority = 2)
	void TestThree()
	{
		System.out.println("This is the Third test");
	}
	
	@Test(priority = 3 , enabled = false)
	void TestFour()
	{
		System.out.println("This is the Fourth test");
	}

}
