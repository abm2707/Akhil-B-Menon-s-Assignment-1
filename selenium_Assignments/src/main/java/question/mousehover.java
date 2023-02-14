package question;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class mousehover {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		WebElement menu  = driver.findElement(By.linkText("KIDS"));
		Actions act = new Actions(driver);
		act.moveToElement(menu).perform();
	}
}
