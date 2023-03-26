package com.seleniumtesting111;

import java.util.List;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Text {

	public static void main(String[] args) throws Exception {


		WebDriverManager.chromedriver().setup();
		

		WebDriver driver = new ChromeDriver();
		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		Thread.sleep(2000);

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
		
		
		driver.close();

	}

	
	}

