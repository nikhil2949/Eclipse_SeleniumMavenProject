package Section2_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions_DragAndDropByOffsetXandY {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement SearchtextField = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		SearchtextField.sendKeys("Iphone 11");
		SearchtextField.submit();
		WebElement leftPointer = driver.findElement(By.xpath("//div[@class='iToJ4v Kaqq1s']/div"));
		WebElement rightPointer = driver.findElement(By.xpath("//div[@class='iToJ4v D0puJn']/div"));
		Thread.sleep(3000);
		Actions action = new Actions(driver);
		action.dragAndDropBy(leftPointer, 50, 0).perform();
		Thread.sleep(3000);
		action.dragAndDropBy(rightPointer, -50, 0).perform();
		
		
	}

}
