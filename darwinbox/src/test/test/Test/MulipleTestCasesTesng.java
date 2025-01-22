package Test;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MulipleTestCasesTesng {
	@BeforeSuite
	public void testng1()
	{	
	}
	@BeforeTest
	public void testng2()
	{
}
	@BeforeClass
	public void testng3()
	{	
	}
	@BeforeMethod
	public void testng4()
	{	
	}
	@Test
	public void testng5()
	{	
	}
	public void testng6()
	{	
	}
	@AfterSuite
	public void testng7()
	{	
	}
	@AfterTest
	public void testng8()
	{	
	}
	@AfterClass
	public void testng9()
	{	
	}
	@AfterMethod
	public void testng10() {
}
}