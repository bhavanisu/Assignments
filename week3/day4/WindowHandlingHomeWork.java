package week3.day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingHomeWork {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();

		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10000));
		Thread.sleep(3000);
		driver.findElement(By.name("USERNAME")).sendKeys("demosalesmanager");
		driver.findElement(By.name("PASSWORD")).sendKeys("crmsfa");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Contacts")).click();
		driver.findElement(By.linkText("Merge Contacts")).click();
	 	String parentwidow = driver.getWindowHandle();
		driver.findElement(By.xpath("(//img[contains(@text(),images)])[9]")).click();
		Set<String> child1 = driver.getWindowHandles();
		List<String> childwindow = new ArrayList<String>(child1);
		driver.switchTo().window(childwindow.get(1));
		driver.findElement(By.linkText("DemoCustomer")).click();
		driver.switchTo().window(parentwidow);
		driver.findElement(By.xpath("(//img[contains(@text(),images)])[10]")).click();
		Set<String> child2 = driver.getWindowHandles();
		List<String> childwindow2 = new ArrayList<String>(child2);
	    driver.switchTo().window(childwindow2.get(1));
		driver.findElement(By.linkText("DemoLBCust")).click();
		driver.switchTo().window(parentwidow);
		driver.findElement(By.linkText("Merge")).click();
		Alert ss =driver.switchTo().alert();
		ss.accept();
		String text = driver.findElement(By.xpath("//div[@class='x-panel-header sectionHeaderTitle']")).getText();
		System.out.println(text);
		
		

}
}