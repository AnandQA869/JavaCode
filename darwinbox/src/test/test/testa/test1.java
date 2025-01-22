package testa;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import Source.Amazon_HomePage;

public class test1 {
@Test
public void login_amazon() throws IOException {
	ChromeDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.in/");
	driver.manage().window().maximize();
	Amazon_HomePage h1 = new Amazon_HomePage(driver);
	h1.accountandlist(driver);
	WebElement h2=driver.findElement(By.xpath("//span[@class='nav-action-inner']"));
	h2.click();
	TakesScreenshot ts=driver;
	File source=ts.getScreenshotAs(OutputType.FILE);
	File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random()+"png");
	FileHandler.copy(source, destination);
}


}

