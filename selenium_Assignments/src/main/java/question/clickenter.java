package question;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class clickenter {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		WebElement username = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.id("pass"));
		Actions act = new Actions(driver);
		act.click(username).sendKeys("testmail@gmail.com").perform();
		act.click(password).sendKeys("password@123").perform();
		WebElement login = driver.findElement(By.name("login"));
		act.click(login).sendKeys(Keys.ENTER).perform(); //clicking on login using ENTER
	}
}
