package com.seleniumtesting111;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectingAllCheckbox {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://itera-qa.azurewebsites.net/home/automation");
		
		Thread.sleep(2000);

		List<WebElement> checkboxes = driver
				.findElements(By.xpath("//input[@type='checkbox'  and contains(@id ,'day')]"));

		System.out.println(checkboxes.size());
		
		for(WebElement box : checkboxes) {
			String ele = box.getAttribute("id");
			System.out.println(ele);
			
			box.click();
		}

		

		Thread.sleep(2000);
		driver.close();

	}

}