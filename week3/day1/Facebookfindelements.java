package week3.day1;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebookfindelements {
	public static void main(String[] args) {
		
	

	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5000));
	List<WebElement> links =driver.findElements(By.tagName("a"));
	int size =links.size();
	System.out.println(size);
	for(WebElement i : links)
	{
		String text = i.getText();
		System.out.println(text);
	}
	
	
	
}
}