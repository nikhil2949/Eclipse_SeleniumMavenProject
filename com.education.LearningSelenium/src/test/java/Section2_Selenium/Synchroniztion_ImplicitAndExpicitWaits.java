package Section2_Selenium;

import java.time.Duration;
import java.util.NoSuchElementException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchroniztion_ImplicitAndExpicitWaits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		wait.until(ExpectedConditions.alertIsPresent());
		driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("nikhilagrahara@gmail.com");
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Nikhil");
		driver.findElement(By.xpath("//button[@type='submit']")).submit();
		Wait wait1 = new FluentWait(driver).withTimeout(Duration.ofSeconds(15)).pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
		driver.close();
		
	}

}
