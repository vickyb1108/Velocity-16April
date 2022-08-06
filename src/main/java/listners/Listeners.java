package listners;

import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listeners implements ITestListener
{
    public void onTestStart(ITestResult result)
    {
    	System.out.println("Sanity test started");
    }
	
    public void onTestSuccess(ITestResult result)
    {
    	System.out.println("TC succesfully Passed");
    }
	
    public void onTestFailure(ITestResult result)
    {
    	System.out.println("Taken screenshot");
    }
}
