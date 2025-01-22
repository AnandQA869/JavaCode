package TestngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Test;

public class WAP_Assigement1 {
@Test
public void fun() {
	System.out.println("Hello world");
}
@AfterMethod
public void fun1() {
	System.out.println("Hello");
}
@AfterClass
public void fun2() {
	System.out.println("fun2");
}
}
