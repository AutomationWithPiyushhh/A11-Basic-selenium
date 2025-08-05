package dropDown;

import java.time.Duration;
import java.util.List;

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

//		create the webelement object for dropdown component
		WebElement carDD = driver.findElement(By.id("cars"));
//		create the object for select class
		Select selCar = new Select(carDD);

//		check whether the given dd is multiselect or not
		boolean status = selCar.isMultiple();
		if (status) {
			System.out.println("Given dd is multi select");
		} else {
			System.out.println("Given dd is single select");
		}

		selCar.selectByIndex(3);
		Thread.sleep(1000);
		selCar.selectByIndex(0);

		List<WebElement> options = selCar.getAllSelectedOptions();
		for (WebElement i : options) {
			System.out.println(i.getText());
			Thread.sleep(100);
		}

		WebElement firstSelected = selCar.getFirstSelectedOption();
		System.out.println(firstSelected.getText());

		Thread.sleep(2000);
		selCar.deselectByIndex(3);
		Thread.sleep(1000);
		selCar.deselectByIndex(0);

		selCar.deselectAll();

		Thread.sleep(5000);
		driver.quit();
	}
}