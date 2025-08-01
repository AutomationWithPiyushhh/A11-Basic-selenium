package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Que2 {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		
		driver.get("https://demoqa.com/automation-practice-form/");

//		WebElement first = driver.findElement(By.id("firstName"));
//		first.sendKeys("kashish");
//
//		WebElement last = driver.findElement(By.id("lastName"));
//		last.sendKeys("lakhwani");
//
//		WebElement email = driver.findElement(By.id("userEmail"));
//		email.sendKeys("kashishlakhwani52@gmail.com");

//		WebElement mobile = driver.findElement(By.id("userNumber"));
//		mobile.sendKeys("9369570399");

//		Thread.sleep(5000);
//		WebElement radio = driver.findElement(By.xpath("//label[text()='Female']"));
//		radio.click();

		WebElement subjects = driver.findElement(By.xpath(
				"//div[@class='subjects-auto-complete_value-container subjects-auto-complete_value-container--is-multi css-1hwfws3']"));
		subjects.sendKeys("Selenium");
		WebElement address = driver.findElement(By.id("currentAddress"));
		address.sendKeys("Noida");
		WebElement submit = driver.findElement(By.id("submit"));
		submit.click();

	}
}