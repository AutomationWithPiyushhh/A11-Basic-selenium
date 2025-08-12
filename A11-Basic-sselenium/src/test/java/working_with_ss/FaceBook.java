package working_with_ss;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://www.facebook.com/");

//		ss of webelement	
		WebElement loginBtn = driver.findElement(By.name("login"));

		File src1 = loginBtn.getScreenshotAs(OutputType.FILE);

		File dest1 = new File("path of webelementPIC.png");

		FileHandler.copy(src1, dest1);

		driver.findElement(By.linkText("Forgotten password?")).click();

		Thread.sleep(5000);

//		SS of webpage
		TakesScreenshot tks = (TakesScreenshot) driver;

		File source = tks.getScreenshotAs(OutputType.FILE);

		File destination = new File("./src/test/java/working_with_ss/webpage.png");

		FileHandler.copy(source, destination);

		System.out.println("ss taken successfully!!!");
		driver.quit();
	}
}
