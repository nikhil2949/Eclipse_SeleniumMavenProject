package Section2_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_EndToEndScenario1 {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.makemytrip.com/");
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();
		driver.findElement(By.xpath("//li[@class='selected']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='fromCity']")).sendKeys("Blr");
		driver.findElement(By.xpath("//span[text()='Bengaluru']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='toCity']")).sendKeys("Del");
		driver.findElement(By.xpath("//span[text()='New Delhi']")).click();
		Thread.sleep(3000);
		WebElement calendarChangeButton = driver.findElement(By.xpath("//span[@aria-label='Next Month']"));
	Robot r = new Robot();
	r.keyPress(KeyEvent.VK_LEFT);
		
		
		
	}

}
