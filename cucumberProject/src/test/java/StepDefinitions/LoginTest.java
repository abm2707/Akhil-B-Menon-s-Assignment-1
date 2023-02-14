package StepDefinitions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginTest {

	WebDriver driver;
	Actions act;

	@Given("user launches the application")
	public void user_launches_the_application() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://demo-shopping-website.onrender.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

	}

	@When("user enters username")
	public void user_enters_username() {
		driver.findElement(By.id("user")).sendKeys("Admin");
	}

	@When("user enters password")
	public void user_enters_password() {
		driver.findElement(By.id("pass")).sendKeys("admin123");
	}

	@When("user clocks on login button")
	public void user_clocks_on_login_button() {
		driver.findElement(By.id("submit")).click();
	}

	@Then("user should be logged in successfully")
	public void user_should_be_logged_in_successfully() {
		driver.findElement(By.xpath("/html/body/header/div/div[1]"));
		System.out.println("Log In Successfull !!!");
	}

	@When("user finds Shopping Automation")
	public void user_finds_shopping_automation() {
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement need = driver.findElement(By.id("btn-shopping"));
		act.moveToElement(need).perform();
		act.click();
		
	}

	@Then("finds dell alienware and clicks buynow")
	public void finds_dell_alienware_and_clicks_buynow() {
		Actions act = new Actions(driver);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement need1 = driver.findElement(By.xpath("/html/body/section/div/div/div[2]/div/div[3]/div/a"));
		act.moveToElement(need1).perform();
		need1.click();
	}

}
