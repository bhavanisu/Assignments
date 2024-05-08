package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Create_lead {
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
		driver.findElement(By.linkText("Leads")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[1]")).sendKeys("hcl");
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[3]")).sendKeys("v");
		driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[4]")).sendKeys("bhavani");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Creating lead");
		driver.findElement(By.xpath("(//input[contains(@value,'Create Lead')])")).click();
		String text = driver.findElement(By.xpath("(//div[contains(@id,'sectionHeader')])")).getText();
        System.out.println(text);
        driver.close();
}
	

}
