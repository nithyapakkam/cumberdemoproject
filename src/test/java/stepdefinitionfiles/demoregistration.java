package stepdefinitionfiles;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class demoregistration {
	WebDriver driver;

@Given("User on the user registration page")
public void user_on_the_user_registration_page() {
	System.setProperty("webdiver.chrome.driver", "C:\\Users\\Devavrath\\Desktop\\automation\\chromedriver_win32\\chromedriver.exe");
	 driver = new ChromeDriver();
	//navigate to the  login page using GET method
	driver.get("https://qavbox.github.io/demo/signup/");
	
	driver.manage().window().maximize();
}

@When("User enters a valid Full Name")
public void user_enters_a_valid_full_name() {
	WebElement fullname = driver.findElement(By.xpath("//*[@id=\"username\"]"));
	fullname .sendKeys("nithyasreejith");
   
}

@When("User enters a valid Email")
public void user_enters_a_valid_email() {
	WebElement Email = driver.findElement(By.xpath("//*[@id=\"email\"]"));
	Email.sendKeys("dev@gmail.com");
  
}

@When("User enters a valid Phone Number")
public void user_enters_a_valid_phone_number() {
	WebElement telephone = driver.findElement(By.xpath("//*[@id=\"tel\"]"));
	telephone .sendKeys("9876543210");
   
}

@When("User enters a valid Fax Number")
public void user_enters_a_valid_fax_number() {
   
}

@When("User upload Profile")
public void user_upload_profile() {
	
	WebElement fileInput =driver.findElement(By.xpath("//*[@id=\"container\"]/div[6]/input"));
	fileInput.sendKeys("D:\\kunju  art  pictures\\animals");
	
	//Wait for a few seconds to ensure thev file is uploaded
	try {
		Thread.sleep(5000);
		}
	catch(InterruptedException e)
	{
	e.printStackTrace();
	
}
	
	
    
}

@And("User select Gender")
public void user_select_gender() {
	
	Select dropgender = new Select(driver.findElement(By.xpath("//*[@id=\"container\"]/div[7]/select")));
	dropgender.selectByIndex(2);
    
}

@And("User select Experience")
public void user_select_experience() {
	WebElement experience = driver.findElement(By.xpath("//*[@id=\"container\"]/div[8]/input[1]"));
	experience .sendKeys("1");
	experience.click();
	
    
}

@And("User  select Skills")
public void user_select_skills() {
	WebElement skills = driver.findElement(By.xpath("//*[@id=\"ip\"]"));
	skills.click();
	
  
}

@And("User select Automation Tools")
public void user_select_automation_tools() {
	
	WebElement Tools = driver.findElement(By.xpath("//*[@id=\"tools\"]/option[1]"));
	Tools.click();
    
}

@Then("user clicks the submit button and the user registration should be successful")
public void user_clicks_the_submit_button_and_the_user_registration_should_be_successful() {
    
}
}
