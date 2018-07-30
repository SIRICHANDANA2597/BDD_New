package StepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefinition {
	WebDriver driver;
	String title;
	
	@Given("^login app$")
	public void login_app()  {
	   
		System.setProperty("webdriver.gecko.driver","E:\\geckodriver-v0.20.1-win64\\geckodriver.exe");
		driver=new FirefoxDriver();
		driver.get("https://opensource-demo.orangehrmlive.com");
		title=driver.getTitle();
		System.out.println(title);
	}

	@When("^Validate$")
	public void validate() {
	    System.out.println("Executing!!!!!");
	   
	}

	@Then("^success$")
	public void success()  {
	    System.out.println("Success!!!!!");
	   
	}

}
