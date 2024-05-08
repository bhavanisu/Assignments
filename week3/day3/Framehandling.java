package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framehandling {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_confirm");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		WebElement frame =driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(frame);
		driver.findElement(By.xpath("(//button[@onclick='myFunction()'])")).click();
		Alert a =driver.switchTo().alert();
		a.accept();
		String s =driver.findElement(By.id("demo")).getText();
		System.out.println(s);
		driver.switchTo().defaultContent();
		
		
	}

}
