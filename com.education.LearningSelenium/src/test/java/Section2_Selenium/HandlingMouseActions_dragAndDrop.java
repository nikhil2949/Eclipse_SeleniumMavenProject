package Section2_Selenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseActions_dragAndDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		button.click();
		WebElement dragAndDropElement = driver.findElement(By.xpath("//section[text()='Drag & Drop']"));
		dragAndDropElement.click();
		WebElement dragPosition = driver.findElement(By.xpath("//a[text()='Drag Position']"));
		dragPosition.click();
		WebElement laptopCharger = driver.findElement(By.xpath("//div[text()='Laptop Charger']"));
		WebElement laptopCover = driver.findElement(By.xpath("//div[text()='Laptop Cover']"));
		WebElement mobileCharger = driver.findElement(By.xpath("//div[text()='Mobile Charger']"));
		WebElement mobileCover = driver.findElement(By.xpath("//div[text()='Mobile Cover']"));
		WebElement mobileAccessories = driver.findElement(By.xpath("//div[text()='Mobile Accessories']"));
		WebElement laptopAccessories = driver.findElement(By.xpath("//div[text()='Laptop Accessories']"));
		Actions action = new Actions(driver);
		action.dragAndDrop(laptopCharger, laptopAccessories).perform();
		action.dragAndDrop(laptopCover, laptopAccessories).perform();
		action.dragAndDrop(mobileCharger, mobileAccessories).perform();
		action.dragAndDrop(mobileCover, mobileAccessories).perform();
	}

}
