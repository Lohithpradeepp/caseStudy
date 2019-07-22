package caseStudy02;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS02 {
	 public static WebDriver driver;
	 public static WebDriverWait wait;
	
	@Given("I want to login")
	public void i_want_to_login() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("Open the testmeapp using url")
	public void open_the_testmeapp_using_url() {
		 System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\pradeep\\chromedriver.exe");
		  
		  driver = new ChromeDriver();
		  
		  driver.get("http://192.168.40.4:8083/TestMeApp");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  
		  wait=new WebDriverWait(driver,120); 
	
	}

	@Then("Click on the SignIn button")
	public void click_on_the_SignIn_button() {
		  driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
			 
		  driver.findElement(By.linkText("SignIn")).click();
	
	}

	@Then("Give the inputs {string} and {string}")
	public void give_the_inputs_and(String string, String string2) {
	   driver.findElement(By.name("userName")).sendKeys(string);
	   driver.findElement(By.name("password")).sendKeys(string2);
	   
	}

	@Then("Click on the submit button")
	public void click_on_the_submit_button() throws InterruptedException {
		 driver.findElement(By.name("Login")).click();
		 Thread.sleep(3000);
		 driver.close();
	    
	}


}
