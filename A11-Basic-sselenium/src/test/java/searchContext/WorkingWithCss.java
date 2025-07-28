package searchContext;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WorkingWithCss {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("C:/Users/User/git/A11-Basic-selenium/A11-Basic-sselenium/src/test/java/HTML/signup.html");
		
		
		
		Thread.sleep(2000);
		driver.quit();
	}
}
