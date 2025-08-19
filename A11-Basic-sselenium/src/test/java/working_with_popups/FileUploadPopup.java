package working_with_popups;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploadPopup {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("C:/Users/User/git/A11-Basic-selenium/A11-Basic-sselenium/src/test/java/working_with_popups/fileupload.html");
		
		WebElement resume = driver.findElement(By.id("resumeUpload"));
		Thread.sleep(5000);
		resume.sendKeys("C:\\Users\\User\\OneDrive\\Desktop\\Jenkins.pdf");
		
		Thread.sleep(3000);
		driver.quit();
	}
}
