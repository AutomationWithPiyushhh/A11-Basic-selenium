package working_with_js;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

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

		Actions act = new Actions(driver);
		act.scrollByAmount(0, 500).build().perform();
		Thread.sleep(1000);
		act.scrollByAmount(0, 500).build().perform();
		Thread.sleep(1000);
		act.scrollByAmount(0, 500).build().perform();
		Thread.sleep(1000);

		jse.executeScript("window.scrollBy(0,1000);");
		Thread.sleep(1500);
		jse.executeScript("window.scrollBy(0,-5000);");

		Thread.sleep(4000);
		WebElement check = driver.findElement(By.xpath("(//div[text()='Check it out'])[2]"));

		act.scrollToElement(check).build().perform();

//		check.scrollIntoView(boolean)
//		jse.executeScript("arguments[0].scrollIntoView(true);", check);

		Thread.sleep(5000);
		driver.quit();
	}
}
