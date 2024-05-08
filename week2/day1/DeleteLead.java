package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class DeleteLead {
	
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
			driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[5]")).sendKeys("bho");
			driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[10]")).sendKeys("IT");
			driver.findElement(By.xpath("(//textarea[contains(@class,'inputBox')])")).sendKeys("hi i am in working in IT field");
			driver.findElement(By.xpath("(//input[contains(@class,'inputBox')])[20]")).sendKeys("itspreethi16@gmail.com");
			WebElement s = driver.findElement(By.xpath("(//select[contains(@class,'inputBox')])[6]"));
			Select state = new Select(s);
			state.selectByVisibleText("New York");
            driver.findElement(By.xpath("(//input[contains(@value,'Create Lead')])")).click();
            driver.findElement(By.xpath("(//a[contains(@class,'subMenuButton')])[3]")).click();
            driver.findElement(By.xpath("(//textarea[contains(@class,'inputBox')])")).clear();
            driver.findElement(By.xpath("(//textarea[contains(@class,'inputBox')])[2]")).sendKeys("sorry i am working in the technical domain");
            driver.findElement(By.xpath("(//input[contains(@type,'submit')])")).click();
            String text = driver.findElement(By.xpath("(//div[contains(@id,'sectionHeader')])")).getText();
            System.out.println(text);
            driver.close();
}}
