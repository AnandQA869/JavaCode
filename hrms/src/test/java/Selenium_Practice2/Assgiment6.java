package Selenium_Practice2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Assgiment6 {

	public static void main(String[] args) {
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		
		System.out.println("Welcome Amazon india" ); 
		

	}

}
