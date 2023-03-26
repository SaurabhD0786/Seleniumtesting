package com.seleniumtesting111;

import java.io.File;
import java.io.IOException;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class dropdown2 {

	public static void main(String[] args) throws InterruptedException, IOException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://blazedemo.com/");

		WebElement web = driver.findElement(By.xpath("/html/body/div[3]/form/select[1]"));
		valueselect(web, "Boston");

		Thread.sleep(2000);

		WebElement web1 = driver.findElement(By.xpath("/html/body/div[3]/form/select[2]"));
		valueselect(web1, "London");

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[3]/form/div/input")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div[2]/table/tbody/tr[1]/td[1]/input")).click();

		Thread.sleep(2000);
		
		//started code from here...............
		WebElement ele1 = driver.findElement(By.id("inputName"));

		ele1.sendKeys("Saurabh");
		
		WebElement ele2 = driver.findElement(By.id("address"));

		ele2.sendKeys("Sector 127");
		
		WebElement ele3 = driver.findElement(By.id("city"));

		ele3.sendKeys("Noida");
		
		WebElement ele4 = driver.findElement(By.id("state"));

		ele4.sendKeys("UP");
		
		WebElement ele5 = driver.findElement(By.id("zipCode"));

		ele5.sendKeys("201307");
		
		WebElement web2 = driver.findElement(By.xpath("//*[@id=\"cardType\"]"));
		valueselect(web2, "American Express");
		
		
		WebElement ele6 = driver.findElement(By.id("creditCardNumber"));

		ele6.sendKeys("4242112211228709");
		
		WebElement ele7 = driver.findElement(By.id("creditCardMonth"));

		ele7.sendKeys("04");
		
		WebElement ele8 = driver.findElement(By.id("creditCardYear"));

		ele8.sendKeys("12");
		
		WebElement ele9 = driver.findElement(By.id("nameOnCard"));

		ele9.sendKeys("Saurabh dubey");
		
		
		driver.findElement(By.xpath("/html/body/div[2]/form/div[11]/div/input")).click();
		
		

		TakesScreenshot sc = ((TakesScreenshot) driver);

		File src = sc.getScreenshotAs(OutputType.FILE);
		File f2 = new File("C:\\Users\\Administrator\\Pictures\\Screenshots\\images.png");
		FileUtils.copyFile(src, f2);

		Thread.sleep(2000);

		driver.close();

	}

	public static void valueselect(WebElement el, String val) {
		Select drp = new Select(el);
		List<WebElement> everyvalue = drp.getOptions();

		for (WebElement value : everyvalue) {
			if (value.getText().equals(val)) {// vaalue //
				value.click();
				break;
			}
		}

	}

}