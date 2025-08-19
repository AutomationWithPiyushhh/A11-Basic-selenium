package working_with_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class NotificationPopup {
	public static void main(String[] args) throws InterruptedException {

		ChromeOptions setting = new ChromeOptions();
		setting.addArguments("--disable-notifications");
		
//		setting.addArguments("--incognito");
//		setting.addArguments("--start-maximized");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.easemytrip.com/");

		Thread.sleep(10000);
		driver.quit();
	}
}
