package Section2_Selenium;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement SearchTextfield = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		SearchTextfield.sendKeys("Iphone 11");
		SearchTextfield.submit();
		driver.findElement(By.xpath("//a[text()='Apple iPhone 11 (White, 128 GB)']")).click();
		String currentTabId=driver.getWindowHandle();
		Set <String>allwindowId=driver.getWindowHandles();
		/*
		 * for(String id:allwindowId) { if(!id.equals(currentTabId)) {
		 * driver.switchTo().window(id); } }
		 */
		for(String id:allwindowId)
		{
			driver.switchTo().window(id);
			if(driver.getTitle().equals(""))
			{
				break;
			}
		}
		driver.findElement(By.xpath("//button[@class='QqFHMw vslbG+ In9uk2']")).click();
		String productName = driver.findElement(By.xpath("//span[text()='Apple iPhone 11 (White, 128 GB)']")).getText();
		System.out.println(productName);
		driver.close();
		driver.quit();
		
	}

}
