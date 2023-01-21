package pkg;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazonpblm {

	ChromeDriver driver;
	
	@Before
	public void setup()
	{
		driver=new ChromeDriver();
		driver.get("https://www.amazon.in");
	}
	
	@Test
	public void work()
	{
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("mobiles",Keys.ENTER);
		driver.findElement(By.xpath("//div[@id='nav-cart-text-container']/span[2]")).click();
		driver.findElement(By.xpath("//div[@id='nav-main']/div[2]/div/div/a[5]")).click();
		driver.findElement(By.xpath("//h3[@class='a-spacing-none a-text-normal']")).click();
		driver.findElement(By.xpath("//input[@id='ap_email']")).sendKeys("537df36@gmail.com",Keys.ENTER);
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.navigate().back();
		driver.findElement(By.xpath("//div[@id='nav-main']/div[1]/a")).click();
		
	}
}
