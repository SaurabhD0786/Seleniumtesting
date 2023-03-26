package com.seleniumtesting111;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TextTNG {
	
	WebDriver driver;
	
	@BeforeMethod
	public void beforemethod() {
		System.out.println("Executing before method");
	}

	@BeforeClass
	public void beforeclass() {
		System.out.println("Executing before the class");
	}

	@BeforeTest
	public void beforetest() {

		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

	}

	@Test
	
	public void text() throws InterruptedException {
		WebElement ele = driver.findElement(By.id("name"));

		ele.sendKeys("Saurabh Dubey");

		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.id("phone"));

		ele1.sendKeys("8787878787");

		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.id("email"));

		ele3.sendKeys("Saurabh123@gmail.com");

		Thread.sleep(2000);

		WebElement ele4 = driver.findElement(By.id("password"));

		ele4.sendKeys("55665565");

		Thread.sleep(2000);

		Thread.sleep(2000);

		WebElement ele5 = driver.findElement(By.id("address"));

		ele5.sendKeys("Noida sector 37");

		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[normalize-space()='Submit']")).click();
		
		Thread.sleep(2000);
		
	
	}
	@AfterClass
	public void afterclass() {
		System.out.println("Executing the after the class");
	}

	@AfterMethod
	public void aftermethod() {
		System.out.println("Executing the after the method");
	}

	@AfterTest
	public void teardwon() throws InterruptedException {
		Thread.sleep(2000);
		driver.close();
	}
}
