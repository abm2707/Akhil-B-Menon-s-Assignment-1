package question;

import java.awt.Window;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class windowhandles {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.seleniumframework.com/practiceform/");
		System.out.println("The title of parent window is "+driver.getTitle());
		String ParentWinId = driver.getWindowHandle();
		System.out.println(ParentWinId); // Parent window id
		driver.findElement(By.id("button1")).click();
		
		//opens a new window
		
		Set<String> windows = driver.getWindowHandles();
		String ChildWindowId = null;
		
		Iterator<String> It = windows.iterator();
		It.next();
		ChildWindowId = It.next();
		System.out.println("The title of Child windows is  " +driver.getTitle());
		System.out.println(ChildWindowId);  // child window Id
		driver.switchTo().window(ChildWindowId);
		
//		driver.quit(); //closes both the windows
	}
}
