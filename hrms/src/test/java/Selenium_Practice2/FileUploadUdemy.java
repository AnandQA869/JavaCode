package Selenium_Practice2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadUdemy {

	public static void main(String[] args) throws InterruptedException {
	ChromeDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("https://pdf2jpg.net/");
	
	WebElement e2=driver.findElement(By.xpath("//button[.='Accept all cookies']"));
	e2.click();
	Thread.sleep(2000);
	WebElement e3=driver.findElement(By.xpath("//button[@id='advanced_pdf_file']"));
	
	e3.sendKeys("C:\\Users\\Anand Pramamik\\Downloads\\\\AnandResume.docxQuality Assurance.pdf");
	e3.click();
	Thread.sleep(2000);
	

	}

}
