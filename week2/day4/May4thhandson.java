package week2.day4;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class May4thhandson {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();	
		driver.get("https://www.pvrcinemas.com/");
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000)); 
		driver.findElement(By.xpath("(//div[contains(@class,'cities-overlay cities-active')])[6]")).click();
		driver.findElement(By.xpath("(//div[@class='date-show'])/span[2]")).click();
		driver.findElement(By.xpath("(//div[@id='cinema'])")).click();
		driver.findElement(By.xpath("(//ul[contains(@class,'p-dropdown')])/li[2]")).click();
		driver.findElement(By.xpath("(//div[@id='date'])")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("(//ul[contains(@class,'p-dropdown')])/li[2]")).click();
		

		
		
		

}
}





	


















































