package Section2_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingWindowScrolling_Flipkart {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement SearchtextField = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		SearchtextField.sendKeys("Iphone 15");
		SearchtextField.submit();
		WebElement clockSpeedElement = driver.findElement(By.xpath("//div[text()='Clock Speed']"));
		Thread.sleep(3000);
		//***1st approachBy using actions class***//
		Actions action=new Actions(driver); Thread.sleep(3000);
		action.scrollToElement(clockSpeedElement).perform();

		//***ScrollTo element by robotclass***//
		Robot r = new Robot();
		for(int i=0;i<5;i++) 
		{
			r.keyPress(KeyEvent.VK_PAGE_DOWN);
			r.keyRelease(KeyEvent.VK_PAGE_DOWN);
			Thread.sleep(3000);
		}

		//***ScrollTo Element by JavascriptExecutor***//
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		jse.executeScript("window.scrollBy(0,850);");
	}


}
