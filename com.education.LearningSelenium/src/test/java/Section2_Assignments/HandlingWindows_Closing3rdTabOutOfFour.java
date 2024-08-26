package Section2_Assignments;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingWindows_Closing3rdTabOutOfFour {

	public static void main(String[] args) throws AWTException, InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement SearchTextfield = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		WebElement GroceryLink = driver.findElement(By.xpath("//span[text()='Grocery']"));
		WebElement MobilesLink = driver.findElement(By.xpath("//span[text()='Mobiles']"));
		WebElement FashionLink = driver.findElement(By.xpath("//span[text()='Fashion']"));
		WebElement ElectronicsLink = driver.findElement(By.xpath("//span[text()='Electronics']"));
		Robot r =new Robot();
        r.keyPress(KeyEvent.VK_CONTROL);
        GroceryLink.click();
        r.keyRelease(KeyEvent.VK_CONTROL);
        System.out.println(driver.getTitle());
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        MobilesLink.click();
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        FashionLink.click();
        r.keyRelease(KeyEvent.VK_CONTROL);
        Thread.sleep(2000);
        r.keyPress(KeyEvent.VK_CONTROL);
        ElectronicsLink.click();
        r.keyRelease(KeyEvent.VK_CONTROL);
        

        
}
}