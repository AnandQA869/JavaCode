package TestngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class OrderofExecutionAnnotationAssigment2 {
@BeforeSuite
public void fun() {
	System.out.println("BeforeSuite");
}
@BeforeTest
public void fun1() {
	System.out.println("BeforeTest");
}
@BeforeClass
public void fun2() {
	System.out.println("BeforeClass");

}
@BeforeMethod
public void fun3() {
	System.out.println("BeforeMethod");
}
@Test
public void fun4() {
	System.out.println("@Test");	
}
@AfterMethod
public void fun5() {
	System.out.println("AfterMethod");	
}
@AfterClass
public void fun6() {
	System.out.println("AfterClass");	
}
@AfterTest
public void fun7() {
	System.out.println("AfterTest");	
}
@AfterSuite
public void fun8() {
	System.out.println("AfterSuite");
}
}