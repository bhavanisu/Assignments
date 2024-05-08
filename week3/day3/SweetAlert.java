package week3.day3;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class SweetAlert {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver= new ChromeDriver();
		driver.get("https://www.leafground.com/alert.xhtml");
		driver.manage().window().maximize();
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text')])[5]")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-closethick']")).click();
		/**driver.findElement(By.xpath("(//span[contains(@class,'ui-button-text')])[6]")).click();
		Alert Prompt = driver.switchTo().alert();
		Prompt.sendKeys("testleaf");
		Prompt.accept();
		String text= driver.findElement(By.id("confirm_result")).getText();
		System.out.println(text);**/
		
		
		
		
	}
}
