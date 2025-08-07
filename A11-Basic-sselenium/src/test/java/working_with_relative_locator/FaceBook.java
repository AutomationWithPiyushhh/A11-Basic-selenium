package working_with_relative_locator;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.locators.RelativeLocator;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		String text = driver.findElement(RelativeLocator
				.with(By.tagName("a"))				// desired 
				.toRightOf(By.linkText("Meta Store"))    // reference
				)
				
		.getText();
		System.out.println(text);
		
//		Thread.sleep(5000);
		driver.quit();
	}
}
