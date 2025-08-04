package dropDown;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectDropDown {
	 public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("C:/Users/User/git/A11-Basic-selenium/A11-Basic-sselenium/src/test/java/dropDown/ssdd.html");
		
		Thread.sleep(1000);

		WebElement carDD = driver.findElement(By.id("cars"));
		Select selCar = new Select(carDD);
		selCar.selectByIndex(3);
		
		Thread.sleep(5000);
		driver.close();
	}
}
