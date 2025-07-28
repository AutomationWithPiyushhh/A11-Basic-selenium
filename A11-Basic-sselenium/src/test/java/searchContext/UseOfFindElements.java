package searchContext;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UseOfFindElements {

	 public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
//		List<WebElement> classname = driver.findElements(By.className("_42ft"));
//		System.out.println(classname.size());
		
		List<WebElement> links = driver.findElements(By.tagName(""));
		System.out.println(links.size());
		
		for (WebElement i : links) {
			System.out.println(i.getText());
		}
		
		driver.quit();
	}
}
