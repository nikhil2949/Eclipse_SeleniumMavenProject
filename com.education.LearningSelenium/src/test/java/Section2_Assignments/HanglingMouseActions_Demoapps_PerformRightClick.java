package Section2_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HanglingMouseActions_Demoapps_PerformRightClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebElement button = driver.findElement(By.xpath("//section[text()='Button']"));
		button.click();
		WebElement rightclickoption = driver.findElement(By.xpath("//a[text()='Right Click']"));
		rightclickoption.click();
		WebElement Rightclickbutton = driver.findElement(By.xpath("//button[@id='btn30']"));
		Actions action = new Actions(driver);
		action.contextClick(Rightclickbutton).perform();
		driver.findElement(By.xpath("//div[text()='Yes']")).click();
		/*
		 * String textmessage =
		 * driver.findElement(By.xpath("//span[text()='You selected \"Yes\"']")).getText
		 * (); if(textmessage.contains("'You selected \\\"Yes\\\"'")) {
		 * System.out.println("textmessage"); }
		 */
		driver.findElement(By.xpath("//a[text()='Double Click']")).click();
		WebElement doubleclickelement = driver.findElement(By.xpath("//button[@id='btn20']"));
		action.doubleClick(doubleclickelement).perform();
		WebElement doubleclickElement2 = driver.findElement(By.xpath("//button[@id='btn23']"));
	    action.doubleClick(doubleclickElement2).perform();
		WebElement doubleclickElement3 = driver.findElement(By.xpath("//button[@id='btn25']"));
		action.doubleClick(doubleclickElement3).perform();
		String s1=driver.findElement(By.xpath("//span[contains(text(),'You selected')]")).getText();
		System.out.println(s1);
		
	}
		
}
