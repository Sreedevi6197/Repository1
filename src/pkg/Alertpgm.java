package pkg;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertpgm {

	ChromeDriver driver;
	
	@Before
	public void setup() 
	{
		driver=new ChromeDriver();
		driver.get("file:///E:/sreedevi/sotware%20testing/Alertbox.html");
	}
	
	@Test
	public void alert() 
	{
		driver.findElement(By.xpath("//*[contains(@type,'button')]")).click();
		Alert a=driver.switchTo().alert();
		System.out.println(a.getText());//to verify the text. it should be done before accepting
		a.accept();
		//a.dismiss() to cancel alert
		driver.findElement(By.xpath("//*[contains(@name,'firstname')]")).sendKeys("Sreedevi");
		driver.findElement(By.xpath("//*[contains(@name,'lastname')]")).sendKeys("S");
		driver.findElement(By.xpath("//*[contains(@type,'submit')]")).submit();
	}
}
