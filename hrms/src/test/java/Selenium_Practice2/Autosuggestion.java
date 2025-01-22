package Selenium_Practice2;

import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {

	public static void main(String[] args) {
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.google.com/");
driver.manage().window().maximize();
}
}