package Section2_Assignments;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class Synchronization_DemoappsClickOnButton {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		//WebDriverWait wait= new WebDriverWait(driver,Duration.ofSeconds(10));
		//wait.until(ExpectedConditions.elementSelectionStateToBe(By.xpath("//section[text()='Button']"),true);
		driver.findElement(By.xpath("//section[text()='Button']")).click();
		driver.findElement(By.xpath("//button[@id='btn']")).click();
		driver.findElement(By.xpath("//button[@id='btn3']")).click();
		driver.findElement(By.xpath("//button[@id='btn7']")).click();
		TakesScreenshot ts = (TakesScreenshot)driver;
		File src = ts.getScreenshotAs(OutputType.FILE);
		File destination=new File(".\\Screenshots//demoappsimage.png");
		Files.copy(src, destination);
		
	}


}
