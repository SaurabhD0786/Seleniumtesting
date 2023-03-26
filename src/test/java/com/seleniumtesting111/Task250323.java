package com.seleniumtesting111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Task250323 {
	
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
		
		 driver.manage().window().maximize();

	}
	
	@Test
	public void select2() throws InterruptedException {
		
		WebElement web2 = driver.findElement(By.className("custom-select"));

		Thread.sleep(2000);

		Select drpvalue = new Select(web2);

		drpvalue.selectByValue("2");
		Thread.sleep(2000);	
		driver.close();
	}
	
	
	
	@Test
	
	public void upload() throws InterruptedException{
		
		WebDriverManager.chromedriver().setup();

		driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		driver.findElement(By.xpath("//input[@id='inputGroupFile02']")).sendKeys("C:\\Users\\stock\\Downloads\\sample.pdf");
		Thread.sleep(4000);
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
		
		driver.close();
	}

}