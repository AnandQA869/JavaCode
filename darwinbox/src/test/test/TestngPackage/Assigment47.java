package TestngPackage;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Assigment47 {
@Test 
public void Accer() {
	System.out.println("Accer");
}
@AfterMethod
public void Dell() {
	System.out.println("Dell");
}
@BeforeSuite
public void Lenovo() {
	System.out.println("Lenovo");

}
@AfterClass
public void Samsung() {
	System.out.println("Samsung");
}
}