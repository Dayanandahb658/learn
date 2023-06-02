package Projectsell;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Demo1 
{
@Test(dataProvider ="logintestdata" )
	public void Testlogin(String username, String password)
   {
	   System.setProperty("webdriver.chrome.driver", "./driver/chromedriver.exe");
	   WebDriver driver= new ChromeDriver();
	   driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	   driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	   driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	   driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin 	123");
	   driver.findElement(By.xpath("//*[@type='submit']")).click();
	   driver.quit();
}
   @DataProvider (name="logintestdata")
public Object[][] Login() 
   {
	 Object[][] data=new Object[2][2];
	 data[0][0]="Admin";
	 data[0][1]="admin123";
	 
	 data[0][0]="Admin";
	 data[0][1]="test123";
	 
	 return data;
	 
   }
}


