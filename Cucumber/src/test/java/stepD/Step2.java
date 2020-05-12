package stepD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step2 {
	WebDriver driver=Step1.driver;
	
	@When("^User enters valid username and invalid password$")
	public void user_enters_valid_username_and_invalid_password() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtLoginID']")).sendKeys("pinkyshah");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("1234");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Button1']")).click();
	   // throw new PendingException();
	}

	@Then("^Login should be unsuccessfull$")
	public void login_should_be_unsuccessfull() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		Thread.sleep(1000);
	//String Alert=	driver.switchTo().alert().getText();
	//Assert.assertEquals("Incorrect LoginID / Password", Alert);
		
	   // throw new PendingException();
	}
}
