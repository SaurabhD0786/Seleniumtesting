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


public class SelectTNG {

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
	public void select2() throws InterruptedException {
		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]"));

		System.out.println(checkboxes.size());

		for (WebElement box : checkboxes) {

			String chkn = box.getAttribute("id");
			System.out.println(chkn);

			if (chkn.equals("monday") || chkn.equals("tuesday")) {
				System.out.println("within if");
				box.click();
			}
			
			
		}
		
		



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
