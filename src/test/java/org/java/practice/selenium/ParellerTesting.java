package org.java.practice.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParellerTesting {
	public static WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		
	}
	@Test
	public void test1() {
		driver.get("https://www.browserstack.com/");
		System.out.println("test 1"+driver.getTitle());
		driver.close();
	}
	@Test
	public void test2() {
		driver.get("https://www.google.com/");
		System.out.println("test 2"+driver.getTitle());
		driver.close();
	}
	@Test
	public void test3() {
		driver.get("https://mvnrepository.com/");
		System.out.println("test 3"+driver.getTitle());
		driver.close();
	}
	@Test
	public void test4() {
		driver.get("https://www.facebook.com/");
		System.out.println("test 4"+driver.getTitle());
		driver.close();
	}
	

}
