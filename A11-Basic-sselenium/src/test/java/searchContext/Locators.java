package searchContext;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/");
		
//		WebElement username = driver.findElement(By.id("email"));
//		username.sendKeys("admin");
//		
//		WebElement password = driver.findElement(By.name("pass"));
//		password.sendKeys("abc123");
//		
//		Thread.sleep(3000);
		driver.findElement(By.partialLinkText("F")).click();
//		driver.findElement(By.name("login")).click();

//		driver.get("https://demowebshop.tricentis.com/");
//
//		WebElement comp = driver.findElement(By.partialLinkText("Computers"));
//		comp.click();

		Thread.sleep(3000);
		driver.quit();
	}
}
