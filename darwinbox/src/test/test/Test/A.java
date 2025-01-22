package Test;

import org.testng.annotations.Test;

public class A {
@Test(groups= {"integration"})
	public void fun() {
}
@Test(groups= {"System"})
public void fun2() {	
}
@Test(groups= {"system","smoke"})
public void fun3() {
	
}
@Test (groups= {"system"})
public void fun4() {	
}
@Test(groups= {"integration"})
public void fun5() {
	
}
}
