package amz_Test;

import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.selenium.WebDriver;
import org.testng.annotations.Test;

import Amz_source.facebook_login;

public class Testcae1 {
@Test
public void login_to_validate_date() {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	facebook_login f1=new facebook_login(driver);
	f1.un();
	f1.pwd();
	f1.login();
	//TakesScreenshot ts=driver;
	//File source=ts.getScreenshotAs(OutputType.FILE);
	//File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand.png");
	
}
}
