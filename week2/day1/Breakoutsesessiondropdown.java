package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Breakoutsesessiondropdown {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
		Thread.sleep(3000);
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("HCL");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("bhavani");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("v");

		
		Thread.sleep(3000);

		WebElement source = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select s= new Select(source);
		s.selectByIndex(2);
		
		WebElement ind = driver.findElement(By.id("createLeadForm_industryEnumId"));
		Select s1= new Select(ind);
		s1.selectByVisibleText("Aerospace");
		
		WebElement owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select s2 =new Select(owner);
		s2.selectByValue("OWN_PROPRIETOR");
		
		driver.findElement(By.name("submitButton")).click();
		
	}
		

}
