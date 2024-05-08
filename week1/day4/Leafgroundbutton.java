package week1.day4;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Leafgroundbutton {
	public static void main(String[] args) {
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://leafground.com/button.xhtml");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[1]")).click();
		String text=driver.findElement(By.xpath("(//div[@class='route-bar-breadcrumb'])")).getText();	
		System.out.println(text);
		driver.navigate().back();
		Boolean s=driver.findElement(By.id("j_idt88:j_idt92")).isEnabled();
		System.err.println(s);
		Point location = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[3]")).getLocation();
		System.out.println(location);
		WebElement  color =driver.findElement(By.xpath("(//span[@class='ui-button-icon-left ui-icon ui-c pi pi-save'])"));
		System.out.println("background color is :" +color.getCssValue("background-color"));
		Dimension size = driver.findElement(By.xpath("(//span[@class='ui-button-text ui-c'])[5]")).getSize();
		System.out.println(size);
		driver.close();
	}
	

}
