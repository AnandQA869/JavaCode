package TestngPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MoreThan50TestcaseRun {

	@Test (invocationCount=50)
		public void anand() {
			System.out.println("FUN1");
		}
		
	

}