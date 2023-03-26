package com.seleniumtesting111;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class demoweb1 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/text-box");

		String ExpectedUrl = "https://demoqa.com/text-box";

		String Actualurl = driver.getCurrentUrl();

		if (ExpectedUrl.equals(Actualurl)) {
			System.out.println("Correct Page");
		} else {
			System.out.println("Incorrect page");
		}

		String ExcpectectedTitle = "DEMOQA";

		String Actualtitle = driver.getTitle();

		if (ExcpectectedTitle.equals(Actualtitle)) {
			System.out.println("Correct Page");
		} else {
			System.out.println("Incorrect page");
		}

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"item-0\"]/span")).click();
		Thread.sleep(2000);
		
		//driver.findElement(By.id("item-0")).click();
		//Thread.sleep(2000);

		WebElement ele = driver.findElement(By.id("userName"));

		ele.sendKeys("Saurabh Dubey");

		Thread.sleep(2000);
		
		WebElement elea = driver.findElement(By.id("userEmail"));

		elea.sendKeys("Saurabh@gmail.com");

		WebElement elec = driver.findElement(By.id("currentAddress"));

		elec.sendKeys("Noida 127");

		Thread.sleep(2000);
		
		WebElement eleca = driver.findElement(By.id("permanentAddress"));

		eleca.sendKeys("Noida 127");


		driver.findElement(By.id("submit")).click();
		
		Thread.sleep(2000);

		driver.findElement(By.id("add-to-cart-sauce-labs-bike-light")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"shopping_cart_container\"]/a/span")).click();

		Thread.sleep(3000);

		driver.findElement(By.id("checkout")).click();

		Thread.sleep(3000);

		WebElement ele2 = driver.findElement(By.id("first-name"));

		ele2.sendKeys("Saurabh");

		Thread.sleep(2000);
		
		WebElement ele3 = driver.findElement(By.id("last-name"));

		ele3.sendKeys("Dubey");
		
		Thread.sleep(2000);
		
		WebElement ele4 = driver.findElement(By.id("postal-code"));

		ele4.sendKeys("201301");
		
		Thread.sleep(2000);

		driver.findElement(By.id("continue")).click();
		Thread.sleep(3000);
		
		driver.findElement(By.id("finish")).click();
		
		Thread.sleep(5000);
		
		
		driver.close();

	}

}