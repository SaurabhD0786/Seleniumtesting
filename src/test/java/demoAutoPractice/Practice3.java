package demoAutoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Practice3 {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();

		driver.get("https://demoqa.com/elements");


		//Resize current window to the set dimension


		driver.manage().window().maximize();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//div[@class='header-text'][normalize-space()='Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='header-text'][normalize-space()='Elements']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[normalize-space()='Text Box']")).click();
		Thread.sleep(2000);

		WebElement ele1 = driver.findElement(By.xpath("//input[@id='userName']"));

		ele1.sendKeys("Saurabh");

		Thread.sleep(2000);

		WebElement ele2 = driver.findElement(By.xpath("//input[@id='userEmail']"));

		ele2.sendKeys("Saurabh123@reddifmail");

		Thread.sleep(2000);

		WebElement ele3 = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));

		ele3.sendKeys("salora vihar");

		JavascriptExecutor jse = (JavascriptExecutor)driver;


		jse.executeScript("window.scrollBy(0,250)");

		WebElement ele4 = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));

		ele4.sendKeys("salora vihar");

		WebElement ele5 = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));

		ele5.sendKeys("salora vihar");

		driver.findElement(By.xpath("//button[@id='submit']")).click();

		Thread.sleep(2000);

		driver.findElement(By.xpath("//span[normalize-space()='Web Tables']")).click();


		Thread.sleep(2000);


		driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();


		Thread.sleep(2000);
		
		WebElement ele11 = driver.findElement(By.xpath("//input[@id='firstName']"));

		ele11.sendKeys("Saurabh");
		
		WebElement ele12 = driver.findElement(By.xpath("//input[@id='lastName']"));

		ele12.sendKeys("Tiwari");
		
		WebElement ele13 = driver.findElement(By.xpath("//input[@id='userEmail']"));

		ele13.sendKeys("saurabh11@mail.com");
		
		
		WebElement ele14 = driver.findElement(By.xpath("//input[@id='age']"));

		ele14.sendKeys("22");
		
		
		WebElement ele15 = driver.findElement(By.xpath("//input[@id='salary']"));

		ele15.sendKeys("2");
		
		WebElement ele16 = driver.findElement(By.xpath("//input[@id='department']"));

		ele16.sendKeys("IT");
		
		
		//driver.findElement(By.xpath("//button[@id='addNewRecordButton']")).click();
		
		

		driver.findElement(By.xpath("//button[@id='submit']")).click();

		Thread.sleep(2000);

		List<WebElement> radio = driver.findElements(By.xpath("//label[@for='yesRadio']"));

		System.out.println("The size of the radio is=:" + radio.size());
		for (WebElement btn : radio) {
			Thread.sleep(1000);
			btn.click();
		}

		Thread.sleep(2000);




		//driver.findElement(By.xpath("//span[normalize-space()='Check Box']")).click();

		//Thread.sleep(2000);


		//driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();

		//Thread.sleep(2000);

		//driver.findElement(By.xpath("//span[@class='rct-checkbox']//*[name()='svg']")).click();

		//Thread.sleep(2000);








		//Select drpvalue = new Select(web2);

		//drpvalue.selectByValue("2");


		driver.close();

		driver.quit();


	}

}