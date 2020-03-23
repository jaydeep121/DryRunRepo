package org.java.practice.selenium;

import java.io.File;
import java.io.IOException;
import java.util.Base64;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SeleniumBasic {
	public static WebDriver driver;
	public static void getScreenshot() throws IOException {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in");
		TakesScreenshot takeScreenshot=(TakesScreenshot)driver;
		File srcFile=takeScreenshot.getScreenshotAs(OutputType.FILE);
		String destPath=System.getProperty("user.dir")+"./screenshot/failed.png";
		FileUtils.copyFile(srcFile, new File(destPath));
		System.out.println("screenshot captured");
		driver.close();
	}
	public static void jsSendKeys() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.co.in");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement element=driver.findElement(By.name("q"));
		js.executeScript("arguments[0].value='testing'",element);	
	}
	
	public static void jsScroll() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='See our Customers']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//This will scroll to the specified element
		//js.executeScript("arguments[0].scrollIntoView();", element);
		//This will scroll web page till end.
		js.executeScript("window.scrollTo(0, document.body.scrollHeight)");
	}
	public static void seleniumScroll() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.browserstack.com/");
		WebElement element=driver.findElement(By.xpath("//a[text()='See our Customers']"));
		Actions action=new Actions(driver);
		action.moveToElement(element).build().perform();
	}
	
	public static void main(String arg[]) throws IOException {
		seleniumScroll();
		System.out.println("main closed");
		
	}
	

}
