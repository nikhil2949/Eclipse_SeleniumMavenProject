package Section2_Selenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts_Demoapps {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='Javascript']")).click();
		WebElement alertboxEle = driver.findElement(By.xpath("//button[text()='Alert Box']"));
		alertboxEle.click();
		Alert ale = driver.switchTo().alert();
		System.out.println(ale.getText());
		ale.accept();
	driver.findElement(By.xpath("//a[text()='Confirm']")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("//button[text()='Confirm Box']")).click();
	Thread.sleep(3000);
	System.out.println(ale.getText());
	ale.accept();
	//driver.close();
		
	}

}
