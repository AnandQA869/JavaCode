package TestngPackage;

import org.testng.annotations.Test;

public class OrderofPariority {
@Test (priority=100)

public void logout() {
	
	
}
@Test (priority=-1)
public void login() {
	
}
@Test(priority=100)
public void registration() {
	
	
}
}
