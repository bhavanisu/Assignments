package week3.day1;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Ajio {
	public static void main(String[] args) throws InterruptedException {
		
	
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.ajio.com/");
	driver.findElement(By.name("searchVal")).sendKeys("bags",Keys.ENTER);
	driver.findElement(By.xpath("(//label[contains(@class,'Men')])[1]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("(//label[contains(@class,'Men')])[3]")).click();
	Thread.sleep(3000);
	String text = driver.findElement(By.xpath("(//div[@class='length'])")).getText();
	System.out.println(text);
	List<WebElement> brand = driver.findElements(By.xpath("(//div[contains(@class,'brand')])"));
	brand.size();
	for (WebElement i : brand) {
		String name = i.getText();
		System.out.println("brand of the product:" +name);
		
	}
	
			List<WebElement> names = driver.findElements(By.xpath("(//div[contains(@class,'nameCls')])"));
			brand.size();
			for (WebElement i : names) {
				String p = i.getText();
				System.out.println("list of  names of the bags:" +p);
				
			}
			
	

}
}