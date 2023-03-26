package demoAutoPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DemoCheckboxPractice {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://the-internet.herokuapp.com/");

		Thread.sleep(2000);

		driver.manage().window().maximize();

		driver.findElement(By.xpath("//a[normalize-space()='Checkboxes']")).click();

		Thread.sleep(2000);

		WebElement checkbox=driver.findElement(By.xpath("//input[1]"));

		checkbox.click();

		WebElement checkbox2=driver.findElement(By.xpath("//input[2]"));

		checkbox2.click();
		
		//unchecking the checkboxes.
		
		checkbox.click();
		
		Thread.sleep(2000);
		
		checkbox2.click();


		//System.out.println(checkboxes.size());

		//WebElement checkbox1 = driver.findElement(By.xpath(null))
		//for (WebElement box : checkboxes) {

		//String chkn = box.getAttribute("label");
		//System.out.println(chkn);


		//if (chkn.equals("checkbox 1") || chkn.equals("checkbox 2")) {
		//System.out.println("within if");
		//box.click();

		//}}

		Thread.sleep(2000);

		driver.close();
		//System.out.println(checkboxes.size());

		//for (WebElement box : checkboxes) {

		//String chkn = box.getAttribute("id");
		//System.out.println(chkn);
		//			System.out.println(chkn.endsWith("monday"));
		//			System.out.println(chkn.endsWith("tuesday"));

		//if (chkn.equals("monday") || chkn.equals("tuesday")) {
		//System.out.println("within if");
		//box.click();
	}}
//}

//Thread.sleep(4000);



