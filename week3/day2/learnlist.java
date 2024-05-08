package week3.day2;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class learnlist {
            public static void main(String[] args) {
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.amazon.in");
	driver.findElement(By.id("twotabsearchtextbox")).sendKeys("toys for kids",Keys.ENTER);
	List<WebElement> toys = driver.findElements(By.className("a-price-whole"));
	int size = toys.size();
	System.out.println(size);
    List<Integer> unq = new ArrayList<Integer>();
	for (WebElement i : toys) 
	{
		String text = i.getText();
		System.out.println(text);
		String replace = text.replace(",","");
		System.out.println(replace);	
	    int parse = Integer.parseInt(replace);
	    System.out.println(parse);
	    unq.add(parse);
	}
	System.out.println(unq);
	Set<Integer> unqq= new TreeSet<Integer>(unq);
	System.out.println("it will remove duplicates:" +unqq +"\n" +unqq.size());
}
            
            
}

