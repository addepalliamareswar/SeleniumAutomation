package SeleniumAutomation.Demo.firstpackage;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import SeleniumAutomation.Demo.Extent.Reports.ExtentTestManager;

public class SecondTestClass extends AbstractTestClass {
	
	@Test
	public void secondTestMethod1() {
		ExtentTestManager.getTest().log(Status.INFO, "Started Second test method1");

		System.out.println("Second Test Method1");
		ExtentTestManager.getTest().log(Status.INFO, "End Second test method1");

	}
	
	@Test
    public void secondTestMethod2() {
		ExtentTestManager.getTest().log(Status.INFO, "End Second test method 2");

		System.out.println("Second Test Method2");
		commonUtilityMethod();
	}

}
