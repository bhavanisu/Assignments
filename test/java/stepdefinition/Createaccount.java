package stepdefinition;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Createaccount extends Baseclass 
{
	@And("Enter the us as {string}")
    public void enterUserName(String username) {
        driver.findElement(By.id("username")).sendKeys(username);
    }
    @And("Enter the pwd as {string}")
    public void enterPassword(String password) {
        driver.findElement(By.id("password")).sendKeys(password);
    }
    
    @When("Click on login button")
    public void clickLoginButton() {
        driver.findElement(By.className("decorativeSubmit")).click();
    }
    
    @Then("Home Page should be displayed")
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
	@When("click on CRMSFAhome button")
	  public void CRMSFAlink()
	  {
		driver.findElement(By.partialLinkText("CRM")).click();

	  }
	@Then("myhomepage should be displayed")
	public void verifyHome() {
	        
	        String expectResult = driver.getTitle();
	        
	        String actualResult="My Home | opentaps CRM";
	        
	        
	        if(expectResult.equals(actualResult)) {
	            System.out.println("The Homepage should be displayed");
	        }else {
	            System.out.println("The Homepage should not be displayed");
	        }
	        
	    }
	@Given("click on accounts button")
	public void accounts() {
		driver.findElement(By.linkText("Accounts")).click();
	}
	@And("click on create account button")
	public void createaccount() {
		driver.findElement(By.linkText("Create Account")).click();
	}
	@And("enter the account name as {string}")
	 public void addname(String name) {
		driver.findElement(By.id("accountName")).sendKeys(name);
	}
	@When("click on create button")
	public void create() {
		driver.findElement(By.xpath("(//input[@type='submit'])")).click();
	}
	@Then("Createaccount page should be displayed")
	public void verifytitle() {
		String expectResult = driver.getTitle();
        
        String actualResult="Create Account | opentaps CRM";
        
        
        if(expectResult.equals(actualResult)) {
            System.out.println("The create account should be displayed");
        }else {
            System.out.println("The create account should not be displayed");
        }
	}    
     @Given("click on the edit button")
		public void editaccount()
		{
			driver.findElement(By.linkText("Edit")).click();
		}
  
       @And("edit the name in the account name button {string}")
       public void ReEdit(String Rename)
       {
   		driver.findElement(By.id("accountName")).sendKeys(Rename);
       }
      @When("click on the save button")
        public void save() {
    	  driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
      }
      
      @Then("Account details page should be displayed")
      public void pagetitle() {
    	  
      String expectResult = driver.getTitle();
      
      String actualResult="Account Details | opentaps CRM";
      
      
      if(expectResult.equals(actualResult)) {
          System.out.println("The account Details should be displayed");
      }else {
          System.out.println("The account Details  should not be displayed");
      }
	}   
     @When("click on the Deactivate button")
      public void deactivate() {
	       driver.findElement(By.linkText("Deactivate Account")).click();
       }
       @Given("click on the ok button in the popup")
         public void alertbox() {
	 
      Alert s = driver.switchTo().alert();
	   s.accept();
	 }
       @Then("print the deactivate message")
   public void message() {
	String text = driver.findElement(By.xpath("(//span[@class='subSectionWarning'])")).getText();
	System.out.println(text);
}

  


	 
	
	


}
