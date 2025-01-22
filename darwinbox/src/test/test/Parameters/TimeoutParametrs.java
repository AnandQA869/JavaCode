package Parameters;

import org.testng.annotations.Test;

import darwinbox.ChromeDriver;

public class TimeoutParametrs {
@Test (timeOut=10)
public void fun1()
{
	ChromeDriver driver=new ChromeDriver();
}

}
