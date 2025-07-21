package wd_methods;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.chrome.ChromeDriver;

public class Instagram {
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();

		driver.get("https://www.instagram.com/");

//		Thread.sleep(2000);
//		driver.manage().window().minimize();
//		Thread.sleep(2000);
//		driver.manage().window().fullscreen();

		Window win = driver.manage().window();

//		Dimension dim1 = win.getSize();
//		System.out.println(dim1);
//
//		int w = dim1.getWidth();
//		System.out.println(w);
//
//		int h = dim1.getHeight();
//		System.out.println(h);

//		Dimension dim2 = new Dimension(1008,528);

//		win.setSize(dim2);
		
		
		Point pt1 = win.getPosition();
		System.out.println(pt1);
		int x = pt1.getX();
		int y = pt1.getY();
		
		System.out.println("X coordinate : " + x + "Y coordinate : " + y);

		Point pt2 = new Point(0, 0);
		win.setPosition(pt2);
		
		Thread.sleep(10000);

//		driver.close();
		driver.quit();
	}
}
