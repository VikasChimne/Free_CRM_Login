package StepDefinition;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.*;

public class LoginStepDefinition {

	WebDriver driver;
	@Given("user is already on Login Page")
	public void user_is_already_on_login_page() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\eclipse-workspace\\Free_CRM_Login\\Drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://www.freecrm.com/");
	    	}

	@Then("user clicks on Log In button")
	public void user_clicks_on_log_in_button() {
		WebElement loginBtn=driver.findElement(By.xpath("//span[contains(text(),'Log In')]"));
	    
	}

	@When("title of login page is {string}")
	public void title_of_login_page_is(String string) {
		String title = driver.getTitle();
	    System.out.println(title);
	    Assert.assertEquals("#1 Free CRM customer relationship management software cloud",title);
	}

	@Then("user enters username and password")
	public void user_enters_username_and_password() {
	    driver.findElement(By.name("username")).sendKeys("naveenk");
	    driver.findElement(By.name("password")).sendKeys("test@123");
	}

	@Then("user clicks on login button")
	public void user_clicks_on_login_button() {
	    WebElement loginBtn=driver.findElement(By.xpath("//input[@type='submit']"));
	}

	@Then("user is on home page")
	public void user_is_on_home_page() {
	    String title = driver.getTitle();
	    System.out.println("Home Page title ::"+ title);
	    Assert.assertEquals("CRMPRO",title);
	}

	@And("close browser")
	public void close_browser() {
	   driver.quit();
	}
}
