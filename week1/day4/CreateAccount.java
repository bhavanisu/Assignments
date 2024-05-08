package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(3000);
	    driver.findElement(By.linkText("Accounts")).click();
	    driver.findElement(By.partialLinkText("Create")).click();
	    driver.findElement(By.id("accountName")).sendKeys("Bhavani");
	    driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
	    driver.findElement(By.id("numberEmployees")).sendKeys("20");
	    driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
	    driver.findElement(By.xpath("(//input[@type='submit'])")).click();
	   String text= driver.findElement(By.id("sectionHeaderTitle_accounts")).getText();
	    System.out.println(text);
	    
	    
	    
	}   
}
