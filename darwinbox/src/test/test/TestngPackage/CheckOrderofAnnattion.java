package TestngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterClass;

import org.testng.annotations.Test;

public class CheckOrderofAnnattion {
@Test
public void Test() {
	
	System.out.println("Test");
}
@AfterMethod
public void Method() {
	System.out.println("Method");
}
@AfterClass
public void AfterClass() {
	System.out.println("AfterClass");
}
}
