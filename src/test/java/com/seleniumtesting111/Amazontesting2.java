package com.seleniumtesting111;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazontesting2 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.amazon.com/");

		String ExpectedUrl = "https://www.amazon.com/";

		String Actualurl = driver.getCurrentUrl();

		if (ExpectedUrl.equals(Actualurl)) {
			System.out.println("Correct Page");
		} else {
			System.out.println("Incorrect page");
		}

		//String ExcpectectedTitle = "Swag Labs";

		//String Actualtitle = driver.getTitle();

		//if (ExcpectectedTitle.equals(Actualtitle)) {
		//System.out.println("Correct Page");
		//} else {
		//System.out.println("Incorrect page");
		//}

		//Thread.sleep(2000);

		//WebElement ele = driver.findElement(By.id("user-name"));

		//ele.sendKeys("standard_user");

		//Thread.sleep(2000);

		//WebElement ele1 = driver.findElement(By.id("password"));

		//ele1.sendKeys("secret_sauce");

		//Thread.sleep(2000);

		driver.findElement(By.xpath("//i[@class='hm-icon nav-sprite']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();

		//Thread.sleep(3000);

		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/a[1]")).click();

		//Thread.sleep(3000);

		

		driver.close();

	}

}