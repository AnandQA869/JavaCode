package Selenium_Practice2;

import java.awt.Point;
import java.io.File;
import java.io.IOException;
import java.util.Set;

//import org.Point org.openqa.selenium.WebElement.getLocation()
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Windowhandles_Windowhandle {

	public static void main(String[] args) throws IOException {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.youtube.com/");
WebElement e1=driver.findElement(By.name("search_query"));
e1.sendKeys("grotechminds"+Keys.ENTER);





TakesScreenshot ts=driver;
File source =ts.getScreenshotAs(OutputType.FILE);
File destination=new File("C:\\Users\\Anand Pramamik\\Downloads\\Screenshot\\Anand.pdf");
FileHandler.copy(source, destination);

String parentid=driver.getWindowHandle();
System.out.println(parentid);
Set<String>d1=driver.getWindowHandles();
System.out.println(d1);
 





	}

	
	}


