package caseStudy4;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CS04 {
	
	public static WebDriver driver;
	public static WebDriverWait wait;
	
	
	@Given("Open the TestMeApp")
	public void open_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\test\\Desktop\\pradeep\\chromedriver.exe");
		driver = new ChromeDriver() ;
		driver.get("http://192.168.40.4:8083/TestMeApp1");
		  
		  driver.manage().window().maximize();
		  
		  driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);
		  
		  wait=new WebDriverWait(driver,120);

	}

	@Given("Login to the TestMeApp")
	public void login_to_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		 
		  driver.findElement(By.linkText("SignIn")).click();
	}

	@Then("Inputs {string} and {string}")
	public void inputs_and(String string, String string2) {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("userName")).sendKeys(string);
		   driver.findElement(By.name("password")).sendKeys(string2);
	}

	@Then("Click On login button")
	public void click_On_login_button() {
	    // Write code here that turns the phrase above into concrete actions
		 driver.findElement(By.name("Login")).click();
	}

	@Given("Alex has registered to the TestMeApp")
	public void alex_has_registered_to_the_TestMeApp() {
	    // Write code here that turns the phrase above into concrete actions
		
	}

	@When("Alex searches for a particular product like headphones")
	public void alex_searches_for_a_particular_product_like_headphones() {
	    // Write code here that turns the phrase above into concrete actions
		driver.findElement(By.name("products")).sendKeys("HeadPhone");
		driver.findElement(By.xpath(".//input[@value='FIND DETAILS']")).click();

	}

	@When("try to proceed to payment without adding to the cart")
	public void try_to_proceed_to_payment_without_adding_to_the_cart() {
	    // Write code here that turns the phrase above into concrete actions
	if (driver.findElements(By.cssSelector("i.fa.fa-shopping-cart")).size()!=0) {
		driver.findElement(By.cssSelector("i.fa.fa-shopping-cart")).click();
			}
	else {
		System.out.println("\n\nICON NOT FOUND\n\n");
	  }		
	}

	@Then("TestMeApp doesnot show the cart item")
	public void testmeapp_doesnot_show_the_cart_item() {
	    // Write code here that turns the phrase above into concrete actions
		driver.close();
	   
	}
}
