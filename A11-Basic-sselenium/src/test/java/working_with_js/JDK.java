package working_with_js;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JDK {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.oracle.com/java/technologies/javase-jdk23-doc-downloads.html");

		driver.findElement(By.linkText("jdk-23.0.2_doc-all.zip")).click();

		WebElement link = driver.findElement(By.linkText("Download jdk-23.0.2_doc-all.zip"));
//		link.click();

		JavascriptExecutor jse = (JavascriptExecutor) driver;
		jse.executeScript("arguments[0].click();", link);
		

	}
}
