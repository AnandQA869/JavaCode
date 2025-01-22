package TestngPackage;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

public class AssertionClass {
@Test 
public void fun1() {
	//Assert.assertTrue(false);
	//Assert.assertTrue(false, Null);
	Assert.assertEquals(false, 10);
}
}
