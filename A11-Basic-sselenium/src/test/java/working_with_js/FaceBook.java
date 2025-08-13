package working_with_js;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

		JavascriptExecutor jse = (JavascriptExecutor) driver;

		WebElement loginBtn = driver.findElement(By.name("login"));
		WebElement forgotPwd = driver.findElement(By.partialLinkText("F"));
		WebElement pwd = driver.findElement(By.id("pass"));

		loginBtn.click();
		pwd.sendKeys("1234567890");
//		sendKeys('') => value = ' '

		jse.executeScript("arguments[0].click();", loginBtn);
		jse.executeScript("arguments[0].click();", forgotPwd);
		jse.executeScript("arguments[0].value='1234567890';", pwd);

		Thread.sleep(5000);
		driver.quit();
	}
}
