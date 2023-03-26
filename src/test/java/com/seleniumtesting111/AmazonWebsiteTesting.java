package com.seleniumtesting111;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonWebsiteTesting {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.flipkart.com/");

		String ExpectedUrl = "https://www.flipkart.com/";

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

		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/a/div[1]/div/img")).click();

		Thread.sleep(2000);

		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();

		//Thread.sleep(3000);

		//driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/a[1]")).click();

		//Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div/div")).click();

		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[3]/div/div/div[2]/div[2]/div/div/div[1]/form/input"));

		ele2.sendKeys("201307");

		driver.findElement(By.name("pincode")).sendKeys(Keys.ENTER);


		Thread.sleep(2000);

		//WebElement ele3 = driver.findElement(By.id("last-name"));

		//ele3.sendKeys("Dubey");

		//Thread.sleep(2000);

		//WebElement ele4 = driver.findElement(By.id("postal-code"));

		//ele4.sendKeys("201301");

		//Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[5]/div/div/div/div/div[1]/div/div/div/div[2]/div/button")).click();


		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[17]/div/div/div[2]/img")).click();


		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div/button")).click();


		Thread.sleep(3000);

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[3]/a/img")).click();


		Thread.sleep(3000);
		

		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[1]/div[1]/div[2]/div[6]/div/div/a")).click();

		//driver.findElement(By.id("finish")).click();

		Thread.sleep(3000);
		
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[2]/div/div[2]/div/button")).click();

		//driver.findElement(By.id("finish")).click();

		Thread.sleep(3000);


		driver.close();

	}

}