package week1.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LeadCheckboxes {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://leafground.com/checkbox.xhtml");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[4]")).click();
		Thread.sleep(5000);
		String t= driver.findElement(By.xpath("(//div[contains(@class,'ui-growl')])")).getText();
		System.out.println(t);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-chkbox')])[6]")).click();
		driver.findElement(By.id("j_idt87:ajaxTriState")).click();
		Thread.sleep(3000);
	 //String text = driver.findElement(By.id("j_idt87:ajaxTriState")).getText();
	 //stem.out.println(text);
		String text = driver.findElement(By.id("j_idt87:id_container")).getText();
		System.out.println(text);
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-toggleswitch')])[2]")).click();
		Thread.sleep(4000);
		String s =driver.findElement(By.xpath("(//div[contains(@class,'ui-growl')])")).getText();
		System.out.println(s);
		boolean b =driver.findElement(By.id("j_idt87:j_idt102")).isSelected();
		System.out.println(b);
		driver.findElement(By.xpath("(//div[contains(@class,'ui-selectcheckboxmenu')])[2]")).click();
		driver.findElement(By.xpath("(//div[contains(@class,'chkbox-box')])[13]")).click();
		driver.findElement(By.xpath("(//a[contains(@class,'selectcheckboxmenu')])")).click();
		
		
	}}




























