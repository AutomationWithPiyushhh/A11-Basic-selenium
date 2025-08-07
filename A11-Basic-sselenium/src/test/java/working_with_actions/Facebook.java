package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://www.facebook.com/");
		
		WebElement forPwd = driver.findElement(By.partialLinkText("Forgotten"));
		
		Actions act = new Actions(driver);
//		act.moveToElement(forPwd).build().perform();
//		Thread.sleep(3000);
		act.click(forPwd).build().perform();

		Thread.sleep(3000);
		
		driver.get("https://jqueryui.com/slider/");
		
		driver.switchTo().frame(0);
		WebElement slider = driver.findElement(By.id("slider"));

//		act.moveToElement(slider).moveByOffset(50, 0).click().build().perform();
		act.moveToElement(slider, 50, 0).click().build().perform();
		
		Thread.sleep(5000);
		driver.quit();
	}
}
