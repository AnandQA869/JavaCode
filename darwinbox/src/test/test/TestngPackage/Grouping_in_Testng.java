package TestngPackage;

import org.testng.annotations.Test;

public class Grouping_in_Testng {
@Test(groups= {"integration"})
public void fun1() {
	
	
}
@Test(groups= {"system"})
public void fun2() {
	
}
@Test(groups= {"integration"})
public void fun3() {
	
}
@Test(groups= {"integration"})
public void fun4() {
	
}
@Test(groups = {"system","smoke"})
public void fun5() {
	
}
}
