package TestngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Assigment48 {
@BeforeMethod
public void Accenture() {
	System.out.println("Accenture");
}
@Test
public void Deloitte() {
	System.out.println("Deloitte");
}
@AfterMethod
public void DixonTechno() {
	System.out.println("Dixon Tech");
}
}
