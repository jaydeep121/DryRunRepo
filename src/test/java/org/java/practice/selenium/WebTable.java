package org.java.practice.selenium;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebTable {
	static WebDriver driver;
	public static void getTable() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		List<WebElement> tableWlwments=driver.findElements(By.xpath("//table[@id='customers']//tbody//tr//td"));
		for(WebElement element:tableWlwments) {
			if(element.getText().equalsIgnoreCase("Austria")) {
				System.out.println("country Name-- "+element.getText());
				break;
			}
		}
		driver.close();
	}
	public static void main(String arg[]) {
		getTable();
		
		
	}
}
