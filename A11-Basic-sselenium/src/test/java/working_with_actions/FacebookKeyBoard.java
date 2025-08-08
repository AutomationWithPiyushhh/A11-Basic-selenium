package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class FacebookKeyBoard {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		Actions act = new Actions(driver);

//		act.sendKeys("admin" + Keys.TAB + "1234567890" + Keys.ENTER).build().perform();

//		enter admin	
		act.sendKeys("admin").build().perform();

//		select all + copy
		act.keyDown(Keys.CONTROL).sendKeys("a" + "c").keyUp(Keys.CONTROL).build().perform();

//		go to pwd => press tab & release it
		act.keyDown(Keys.TAB).build().perform();
		act.keyUp(Keys.TAB).build().perform();

//		paste
		act.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

//		press enter
		act.keyDown(Keys.ENTER).build().perform();
		act.keyUp(Keys.ENTER).build().perform();

		Thread.sleep(5000);
		driver.quit();
	}
}
