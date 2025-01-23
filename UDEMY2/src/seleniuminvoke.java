import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniuminvoke {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Step to Invoke Chrome driver 
		
		WebDriver driver = new ChromeDriver();
		
		//driver.get("https://cafehrvarunagroup.darwinbox.in/user/login");
		
		//driver.findElement(By.id("UserLogin_username")).sendKeys("anandcse430@gmail.com");
	////driver.findElement(By.id);
			//System.out.println(driver.getTitle());	
			
			//System.out.println(driver.getCurrentUrl());
			//System.out.println("welcome to india");
			
			//System.out.println("hello");
		driver.switchTo().alert().sendKeys("anand");
			
			driver.close();
			//driver.quit();
			

	}

}
