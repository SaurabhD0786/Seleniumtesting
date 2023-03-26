package com.seleniumtesting111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");

		Thread.sleep(2000);
		//Resize current window to the set dimension
	        driver.manage().window().maximize();
	        
		WebElement web2 = driver.findElement(By.className("custom-select"));

		Thread.sleep(2000);

		Select drpvalue = new Select(web2);

		drpvalue.selectByValue("2");

		Thread.sleep(2000);


		driver.close();


	}

}