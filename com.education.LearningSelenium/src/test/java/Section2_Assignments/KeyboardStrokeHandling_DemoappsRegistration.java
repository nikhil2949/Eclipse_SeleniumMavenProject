package Section2_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStrokeHandling_DemoappsRegistration {

	public static void main(String[] args) throws InterruptedException, AWTException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@id='name']")).click();
		Thread.sleep(3000);
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='email']")).click();
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_K);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_H);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_AT);
		r.keyPress(KeyEvent.VK_G);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_M);
		r.keyPress(KeyEvent.VK_A);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyPress(KeyEvent.VK_L);
		r.keyPress(KeyEvent.VK_C);
		r.keyPress(KeyEvent.VK_O);
		r.keyPress(KeyEvent.VK_M);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//input[@type='password']")).click();
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_N);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_K);
		r.keyPress(KeyEvent.VK_H);
		r.keyPress(KeyEvent.VK_I);
		Thread.sleep(2000);

		r.keyPress(KeyEvent.VK_L);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//button[@type='submit']")).submit();

		





	}

}
