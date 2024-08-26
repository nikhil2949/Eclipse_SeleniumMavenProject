package Section2_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class KeyboardStrokeHandling_OrangeHRM {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		Thread.sleep(3000);
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@name='username']")).click();
		Robot r = new Robot();
		Thread.sleep(3000);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		r.keyPress(KeyEvent.VK_A);
		r.keyRelease(KeyEvent.VK_A);
		r.keyPress(KeyEvent.VK_CAPS_LOCK);
		r.keyRelease(KeyEvent.VK_CAPS_LOCK);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_D);
		r.keyRelease(KeyEvent.VK_D);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_M);
		r.keyRelease(KeyEvent.VK_M);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_I);
		r.keyRelease(KeyEvent.VK_I);
		Thread.sleep(2000);
		r.keyPress(KeyEvent.VK_N);
		r.keyRelease(KeyEvent.VK_N);
		Thread.sleep(2000);
driver.findElement(By.xpath("//input[@type='password']")).click();
r.keyPress(KeyEvent.VK_A);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_D);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_M);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_I);
r.keyPress(KeyEvent.VK_N);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_1);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_2);
Thread.sleep(2000);
r.keyPress(KeyEvent.VK_3);
Thread.sleep(2000);
driver.findElement(By.xpath("//button[@type='submit']")).submit();



		



	}

}
