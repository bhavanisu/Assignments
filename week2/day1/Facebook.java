package week2.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
		driver.findElement(By.xpath("(//a[contains(@class,'_42ft')])[1]")).click();
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[3]")).sendKeys("v");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[4]")).sendKeys("bhavani");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[5]")).sendKeys("9176594997");
		driver.findElement(By.xpath("(//input[contains(@class,'inputtext')])[7]")).sendKeys("Preethi@1990");
		WebElement day =driver.findElement(By.id("day"));
		Select s= new Select(day);
		s.selectByIndex(1);
		WebElement month = driver.findElement(By.id("month"));
		Select m= new Select(month);
		m.selectByValue("2");
		WebElement year = driver.findElement(By.id("year"));
		Select y= new Select(year);
		y.selectByVisibleText("1990");
		driver.findElement(By.xpath("(//label[contains(@class,'_58mt')])[1]")).click();
		
		
		
		
		
	}

}