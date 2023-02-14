package question;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class hiddenelement {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://courses.letskodeit.com/practice");
		driver.findElement(By.xpath("//*[@id=\"hide-textbox\"]")).click();
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("document.getElementById('displayed-text').value = 'Akhil';");
	}
		
//		
	
}
