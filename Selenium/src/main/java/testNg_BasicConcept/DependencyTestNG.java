package testNg_BasicConcept;

import org.testng.annotations.Test;

public class DependencyTestNG {
	
	@Test
	void startCar()
	{
		System.out.println("The car will start");
	}

	
	@Test(dependsOnMethods = {"startCar"} )
	void driveCar()
	{
		System.out.println("The car will be drived");
	}

	
	@Test(dependsOnMethods = {"startCar","driveCar"} )
	void stopCar()
	{
		System.out.println("The car will stopped");
	}

	
	@Test(dependsOnMethods = {"stopCar","driveCar"}, alwaysRun = true )
	void parkCar()
	{
		System.out.println("The car will parked");
	}

	
	
}
