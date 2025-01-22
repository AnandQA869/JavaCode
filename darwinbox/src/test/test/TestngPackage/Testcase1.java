package TestngPackage;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testcase1 {
	
		@Test(priority=0)
		public void Login_to_Amazon1() {
		System.out.println("Login");	
		}
		@Test (priority=-1)
		public void Login_to_Amazon() {
			System.out.println("Login1");
		}
	}


