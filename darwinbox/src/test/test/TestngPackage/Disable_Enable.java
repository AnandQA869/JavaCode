package TestngPackage;

import org.testng.annotations.Test;

public class Disable_Enable {
@Test
public void fun1() {
	System.out.println("fun1");
}
@Test
public void fun2() {
	System.out.println("fun2");

}
@Test(enabled=true,invocationCount=50)
public void fun3() {
	System.out.println("fun3");
}
@Test 
public void fun4() {
	System.out.println("fun4");
}
}

