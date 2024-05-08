package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Breakoutadvancexpath {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		//driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//p[@class='top']/input")).sendKeys("demosalesmanager");
		driver.findElement(By.xpath("(//form[@id='login']//input)[2]")).sendKeys("crmsfa");
		driver.findElement(By.xpath("(//form[@id='login']//input)[3]")).click();
		driver.findElement(By.xpath("(//div[@id='label']/a)")).click();
		driver.findElement(By.xpath("(//div[@class='x-panel-header']/a)[2]")).click();
		driver.close();
		
		
		
		
	}

}
