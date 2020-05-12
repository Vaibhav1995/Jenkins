package stepD;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Step1 {
public static WebDriver driver;
	
	@Given("^open the browser and login page$")
	public void browser_and_login_page() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\vaibhav-PC\\Desktop\\clover res mgmt\\CloverResourceMgmt\\drivers\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(1000);
		driver.get("http://203.115.123.90:8091/ui/frmLogin.aspx");
		Thread.sleep(1000);
	}
	
	
	@When("^User enters valid username and password$")
	public void un_pw()throws InterruptedException {
		
		driver.findElement(By.xpath("//input[@id='txtLoginID']")).sendKeys("pinkyshah");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("123456");
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='Button1']")).click();
	}
	
	@Then("^Login should be successfull$")
	public void login() throws Throwable
	{
	String Title=	driver.getTitle();
	System.out.println(Title);
	
			
		
	}

}
