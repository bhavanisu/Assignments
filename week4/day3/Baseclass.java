package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Baseclass {
	ChromeDriver driver;

	@BeforeMethod
	public void preCondition() throws InterruptedException {
		driver= new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		
	}


    @AfterMethod
    public void PostCondition()
    {
    	driver.close();
    }
    
}