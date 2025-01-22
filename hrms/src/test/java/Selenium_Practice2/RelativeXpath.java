package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RelativeXpath {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		WebElement txt_Mobile= driver.findElement(By.xpath("//input[@name=\"email\"]"));
		txt_Mobile.sendKeys("8605119718");
		WebElement btn_cntinue= driver.findElement(By.xpath("//input[@id=\"continue\"]"));
		btn_cntinue.click();
		WebElement txt_Pwd= driver.findElement(By.xpath("//input[@id=\"ap_password\"]"));
		txt_Pwd.sendKeys("Pradnya*999");
		WebElement btn_SignIn= driver.findElement(By.xpath("//input[@id='signInSubmit']"));
		btn_SignIn.click();
	
	}


	}


