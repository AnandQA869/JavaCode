package TestngPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofExecution {
@Test

public void zero() {
	System.out.println("zero");
}
@Test
public void Login() {
	System.out.println("Login");
}
@Test(invocationCount=50)
public void Registration() {
	System.out.println("Registration");
}
}