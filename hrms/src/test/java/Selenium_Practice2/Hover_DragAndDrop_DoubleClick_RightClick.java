package Selenium_Practice2;

import javax.swing.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

//How to handle Hover,Drag and Drop DoubleClick Right Click


public class Hover_DragAndDrop_DoubleClick_RightClick {

	public static void main(String[] args) {
	/*
	  HOVER OVER Syntax
	  Actions a1=new Actions(Driver);
	  a1.movetoelement(target element e1).perfome;
	  her e1= this is components on wish u wish to perfome hoverover
	 */
ChromeDriver driver=new ChromeDriver();
driver.get("https://www.amazon.in/");
driver.manage().window().maximize();
WebElement e1=driver.findElement(By.className("nav-line-1-container"));
//WebElement e1=driver.findElement(By.xpath("//span[@class='nav-line-2']"));

Actions a1=new Actions(driver);
a1.moveToElement(e1).perform();
System.out.println("Welcome to Account & List HoverOver");
	}

}
