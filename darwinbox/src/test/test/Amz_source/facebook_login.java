package Amz_source;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

public class facebook_login {
//Step1 
	ChromeDriver driver;
@FindBy(id="email")	
WebElement username;
@FindBy (name="pass")
WebElement password;
@FindBy (xpath="//button[@name='login']")
WebElement login;

public void un() {
	username.sendKeys("anandcse435@gmail.com");
}
public void pwd() {
	password.sendKeys("Anand@123");
}
public void login() {
	login.click();
}
public facebook_login(ChromeDriver driver) {
	PageFactory.initElements(driver,this);
}
}