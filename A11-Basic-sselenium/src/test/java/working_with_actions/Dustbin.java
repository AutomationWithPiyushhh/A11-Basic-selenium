package working_with_actions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Dustbin {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://marcojakob.github.io/dart-dnd/basic/");

		Actions act = new Actions(driver);

		WebElement kachra1 = driver.findElement(By.className("document"));
		WebElement peti1 = driver.findElement(By.className("trash"));
		act.dragAndDrop(kachra1, peti1).build().perform();

		WebElement kachra2 = driver.findElement(By.className("document"));
		WebElement peti2 = driver.findElement(By.className("full"));
		act.dragAndDrop(kachra2, peti2).build().perform();

		WebElement kachra3 = driver.findElement(By.className("document"));
		WebElement peti3 = driver.findElement(By.className("full"));
		act.dragAndDrop(kachra3, peti3).build().perform();

		WebElement kachra4 = driver.findElement(By.className("document"));
		WebElement peti4 = driver.findElement(By.className("full"));
		act.dragAndDrop(kachra4, peti4).build().perform();
		
		
		
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		WebElement drag = driver.findElement(By.id("draggable"));
		WebElement drop = driver.findElement(By.id("droppable"));
		
		act.dragAndDrop(drag, drop).build().perform();
	}
}
