package working_with_js;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.zomato.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

//		Open the URL
		jse.executeScript("window.location='https://www.zomato.com/';");

//		get the title
		System.out.println(jse.executeScript("return document.title;"));

//		Scrolling
		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(500);
		jse.executeScript("window.scrollTo(0,0);");

		Thread.sleep(5000);
		driver.quit();
	}
}
