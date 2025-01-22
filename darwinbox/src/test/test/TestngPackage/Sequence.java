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

public class Sequence
{
	
	@Test
	public void fun3() {
		System.out.println("Test");
	}

@BeforeSuite
public void fun1() {
	System.out.println("BeforeSuite");
}
@BeforeTest
public void fun2() {
	System.out.println("BeforeTest");
}

@BeforeClass
public void fun4() {
	System.out.println("Beforeclasss");
}
@BeforeMethod
public void fun5() {
	System.out.println("BeforeMethod");
}
@AfterSuite
public void fun6() {
	System.out.println("Aftersuite");
}
@AfterTest
public void fun7() {
	System.out.println("AfterTest");
}
@AfterClass
public void fun8() {
	System.out.println("AfterClass");
}
@AfterMethod
public void fun9() {
	System.out.println("AfterMethod");
}
}
