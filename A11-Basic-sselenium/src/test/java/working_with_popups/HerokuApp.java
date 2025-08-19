package working_with_popups;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HerokuApp {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		
		Thread.sleep(5000);
		driver.quit();
	}
}
