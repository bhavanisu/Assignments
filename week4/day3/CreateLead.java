package week4.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;



public class CreateLead extends Baseclass{
    @Test
	public void runcreatelead() {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Hari");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("R");
		driver.findElement(By.name("submitButton")).click();
		driver.close();
}
}






