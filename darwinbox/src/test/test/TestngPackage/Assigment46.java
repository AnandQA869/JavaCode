package TestngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Assigment46 {
@BeforeTest
public void Amazon() {
	System.out.println("Amazon");
}
@BeforeClass
public void Google() {
	System.out.println("Google");
}
@BeforeMethod
public void InstraGram() {
	System.out.println("InstraGram");
}
@AfterMethod
public void FaceBook() {
	System.out.println("FaceBook");
}
@Test
public void Orkut() {
	System.out.println("Orkut");	
}
}
