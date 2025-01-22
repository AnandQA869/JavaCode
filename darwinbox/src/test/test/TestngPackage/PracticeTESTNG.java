package TestngPackage;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class PracticeTESTNG {
@Test(enabled=false)
public void fun() {
	System.out.println("Fun");
}
@BeforeTest
public void fun1() {
	System.out.println("BeforeTest");
}
}