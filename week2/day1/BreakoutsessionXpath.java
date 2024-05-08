package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class BreakoutsessionXpath {

	public static void main(String[] args)throws InterruptedException {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("itspreethi16@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Preethi@1990");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		

	}

}
