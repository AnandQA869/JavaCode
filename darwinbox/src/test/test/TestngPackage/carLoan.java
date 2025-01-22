package TestngPackage;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class carLoan {

	
	@Test
	public void carLoan() {
		System.out.println("Test");
	}
	
	@BeforeClass
	public void carLoan1() {
		System.out.println("Before Suite");
		
		
	}
	@BeforeSuite
	public void car_loan2() {
		System.out.println("Before class");
}
}
