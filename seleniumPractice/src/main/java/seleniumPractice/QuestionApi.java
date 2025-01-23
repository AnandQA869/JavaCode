package seleniumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class QuestionApi {

	public static void main(String[] args) {
		ChromeDriver  driver=new ChromeDriver();
		
		((RemoteWebDriver) driver).get("https://erpapinew.varuna.net/vilmobile/api/Quiz/GetQuestions");
		driver.findElements(By.xpath("//div[@class='json-formatter-container']"));
		System.out.println("welcome Quize India ");
	}

}
