package stepdefinition;

import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createlead extends Baseclass{
	
	
	@And("Enter the username as {string}")
    public void enterUserName(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }
    @And("Enter the password as {string}")
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    
    @When("Click on Login button")
    public void clickLoginButton() {
        driver.findElement(By.className("decorativeSubmit")).click();
    }
    
    @Then("HomePage should be displayed")
    public void verifyHomePage() {
        
        String expectResult = driver.getTitle();
        
        String actualResult="Leaftaps - TestLeaf Automation Platform";
        
        
        if(expectResult.equals(actualResult)) {
            System.out.println("The Homepage should be displayed");
        }else {
            System.out.println("The Homepage should not be displayed");
        }
        
    }
    
//    @But("The error should be displayed")
//    public void errorMsg() {
//        String text = driver.findElement(By.id("errorDiv")).getText();
//        
//        System.out.println(text);
//    }
//    
	@Given("click on CRMSFA button")
	  public void CRMSFAlink()
	  {
		driver.findElement(By.partialLinkText("CRM")).click();

	  }
	@And("click on the leads button")
	  public void leads() {
		driver.findElement(By.linkText("Leads")).click();
	}
	 @And("click on the createlead button")
	 public void createLead() {
			driver.findElement(By.linkText("Create Lead")).click();
     }
	 
	 @And("enter the companyname as {string}")
	   public void companyname(String companyname)	{	
	   driver.findElement(By.id("createLeadForm_companyName")).sendKeys(companyname);
      }   
	 @And("enter the firstname as {string}")
	   public void firstname(String firstname) {
			driver.findElement(By.id("createLeadForm_firstName")).sendKeys(firstname);
	 }
	 @And("enter the lastname as {string}")
	    public void lastname(String lastname) {
			driver.findElement(By.id("createLeadForm_lastName")).sendKeys(lastname);

	 }

	 @When("click on the submit button")
	   public void createlead(){
			driver.findElement(By.name("submitButton")).click();

	 }
       @Then("createlead homepage should be displayed")
         public void checkhomepage() {
    	   String expectResult = driver.getTitle();
	        
	        String actualResult="View Lead | opentaps CRM";
	        
	        if(expectResult.equals(actualResult)) {
	            System.out.println("The viewlead homepage should be displayed");
	        }else {
	            System.out.println("The viewlead homepage should not be displayed");
	        }
	        
	    }
       }






