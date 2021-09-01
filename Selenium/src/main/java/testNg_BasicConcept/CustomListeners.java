package testNg_BasicConcept;

import org.testng.ITestContext;
import org.testng.ITestNGListener;
import org.testng.ITestResult;
import org.testng.internal.annotations.IListeners;

public class CustomListeners implements IListeners {
	
	public void onStart(ITestContext args) {
		System.out.println("Starts Test Execution ....."+ args.getName());
	}
	
	public void onFinish(ITestContext args) {
		System.out.println("Finish the Test Execution ....."+ args.getName());
	}
	
	public void onTestSucess(ITestResult args) {
		System.out.println("Success Test ....."+ args.getName());
	}
	
	public void onTestFailure(ITestResult args) {
		System.out.println("Failure test ....."+ args.getName());
	}

	public Class<? extends ITestNGListener>[] getValue() {
		return null;
		
	}

	public void setValue(Class<? extends ITestNGListener>[] value) {
		
		
	}

}
