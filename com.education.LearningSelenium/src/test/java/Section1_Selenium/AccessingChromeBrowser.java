package Section1_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AccessingChromeBrowser {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
 WebDriver driver= new ChromeDriver();
 Thread.sleep(3000);
 driver.get("https://www.flipkart.com/");
 driver.manage().window().maximize();
 Thread.sleep(3000);
WebElement SearchTextfield = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
Thread.sleep(3000);
SearchTextfield.sendKeys("Iphone 11");
SearchTextfield.submit();
	}

}
