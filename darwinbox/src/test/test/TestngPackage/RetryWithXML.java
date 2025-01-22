package TestngPackage;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryWithXML implements IRetryAnalyzer {
int initialcount=0;
int retrycount=2;// Number you can changes your choice
	@Override
	public boolean retry(ITestResult result)
	{
		if(initialcount<retrycount) {
			initialcount++;
			return true;
		}
		
		
		
		return false;
	}
}
