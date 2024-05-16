package week4.day4;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.Test;
import org.testng.annotations.DataProvider;


public class CreateLead extends Baseclass{
    @Test(dataProvider = "fetchdata")
    
	public void runcreatelead(String companyname, String firstname,String lastname,String phoneNo)
    {
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);
		driver.findElement(By.xpath("//input[@name='primaryPhoneNumber']")).sendKeys(phoneNo);
		driver.findElement(By.name("submitButton")).click();
    }
		
  @DataProvider(name="fetchdata")
  public String[][]sendData() throws IOException{
  
	  ReadExcel excel = new ReadExcel();
	  String[][] runexcel = excel.Runexcel();
	  
	  //String [][] data = new String[3][3];
	// data[0][0] = "wipro";
	  //data[0][1]= "bhavani";
	  //data[0][2]="v";
	  //
			  
	  //data[1][0]="hcl";
	  //data[1][1]="bho";
	  //data[1][2]="s";
	 // 
	  
	  //data[2][0]="CTS";
	  //data[2][1]="PREETHI";
	  //data[2][2]="C";
	  
	  return runexcel;
  }
  
		  
}







