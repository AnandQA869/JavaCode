package TestngPackage;

import java.io.File;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class chossingBrowser {
	WebDriver driver;
	@Test
	@Parameters("browser")
	public void testcase(String nameofbrowser) throws InterruptedException {
		if(nameofbrowser.equals("chrome")) {
			driver=new ChromeDriver();
		}
		if(nameofbrowser.equals("Firefox")) {
			driver=new FirefoxDriver();
		}
		if(nameofbrowser.equals("edge")) {
			driver=new EdgeDriver();
		}
		//driver.manage().window().maximize();
		//driver.get("https://www.amazon.in/");
		//WebElement e1=driver.findElement(By.id("twotabsearchtextbox"));
		//e1.sendKeys("shoes"+Keys.ENTER);
		//Thread.sleep(1000);
		//driver.close();
		driver.get("https://www.dhbvn.org.in/web/portal/home#");
		WebElement e1=driver.findElement(By.xpath("//a[@class='nav-link dropdown-toggle']"));
		WebElement a2=driver.findElement(By.xpath("//a[text()='Deptt. of Power']"));
		Actions a3=new Actions(driver);
		a3.moveToElement(e1).click(a2).build().perform();
		System.out.println("Welcome to Haryana Electric Board Gurgaon");
		//TakesScreenshot ts= driver;
		//File source =ts.getScreenshotAs(OutputType.FILE);
		//single take screen shot 
		//File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand.jpeg");
		//Multiple take screen shot with diffrent diffrent id 

		File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\anand"+Math.random()+"png");

		//FileHandler.copy(source, destination);
		driver.close();
	}
}


		


