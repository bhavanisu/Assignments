package stepdefinition;

import java.time.Duration;

import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class Hookimplementation extends Baseclass{
    
	@Before
    public void PreCondition() {
		driver= new ChromeDriver();
        driver.get("http://leaftaps.com/opentaps/control/main");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
    @After
     public void PostCondition() {
    	driver.close();
    }
    
}

