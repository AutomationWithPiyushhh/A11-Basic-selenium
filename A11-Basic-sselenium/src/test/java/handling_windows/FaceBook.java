package handling_windows;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FaceBook {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");
		
//		1> get the home address/parent window session id
		String pid = driver.getWindowHandle();
		
//		2> perform the task which will open new window/s
		driver.findElement(By.linkText("Meta Pay")).click();
		
//		3> switch to that particular window
		Set<String> IDs = driver.getWindowHandles();
		
		for (String i : IDs) {
			driver.switchTo().window(i);
//			System.out.println(driver.getTitle());
			
			if (driver.getTitle().contains("Pay")) {
				break;
			}
		}
		
		driver.close();
		Thread.sleep(3000);
		
		driver.switchTo().window(pid);
		
		driver.close();

	}
}
