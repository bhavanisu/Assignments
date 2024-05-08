package week2.day1;


import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Homeworkdeletelead {
	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/crmsfa/control/createLeadForm");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts'])/li[3]/a")).click();
		driver.findElement(By.xpath("(//span[contains(@class,'x-tab')])[3]/span")).click();
		driver.findElement(By.id("ext-gen266")).sendKeys("91");
		driver.findElement(By.id("ext-gen270")).sendKeys("9176594997");
		driver.findElement(By.id("ext-gen334")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//a[contains(@class,'linktext')])[4]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'subMenu')])[4]")).click();
		driver.findElement(By.xpath("(//ul[@class='shortcuts'])/li[3]/a")).click();
	    Thread.sleep(3000);
		driver.findElement(By.xpath("(//input[contains(@id,'ext-gen246')])")).sendKeys("12343");
		driver.findElement(By.xpath("(//button[contains(@class,'x-btn-text')])[7]")).click();
		Thread.sleep(3000);
	    String a =driver.findElement(By.xpath("(//div[text()='No records to display'])")).getText();
	    System.out.println(a);
	    driver.close();
	}}


