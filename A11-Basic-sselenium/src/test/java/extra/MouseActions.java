package extra;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MouseActions {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

//		driver.get("https://www.facebook.com/");

//		Select sel = new Select(webelement);

		Actions act = new Actions(driver);
//
//		WebElement link = driver.findElement(By.linkText("Forgotten password?"));
//
//		act.moveToElement(link).build().perform();

//		act.click().build().perform();

//		act.contextClick().build().perform();

//		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
//		
//		WebElement button = driver.findElement(By.tagName("button"));
//		
//		act.doubleClick(button).build().perform();
		
		
		driver.get("https://yonobusiness.sbi/yonobusinesslogin");
		
		driver.findElement(By.id("password")).sendKeys("123456789");
		
		WebElement eye = driver.findElement(By.cssSelector("img[src='assets/img/Revamp/icon_eye_close.svg']"));
//		eye.click();
		act.clickAndHold(eye).build().perform();
		Thread.sleep(3000);
		act.release().build().perform();
		
		
		Thread.sleep(10000);
		driver.quit();
	}
}
