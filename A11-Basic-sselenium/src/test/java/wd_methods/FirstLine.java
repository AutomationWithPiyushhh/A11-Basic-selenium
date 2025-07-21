package wd_methods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstLine {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
//		 				 driver = new EdgeDriver();
//		 				 driver = new FirefoxDriver();

		/*
		 * start the server 
		 * launch the empty chrome browser 
		 * load, register and re-initialize the NS member
		 */
		
		driver.get("https://www.instagram.com/"); //Fully qualified path
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
	}
}
