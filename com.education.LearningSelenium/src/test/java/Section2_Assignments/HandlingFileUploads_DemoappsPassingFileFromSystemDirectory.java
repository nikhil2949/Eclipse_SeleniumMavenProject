package Section2_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFileUploads_DemoappsPassingFileFromSystemDirectory {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Popups']")).click();
		driver.findElement(By.xpath("//section[text()='File Uploads']")).click();
		driver.findElement(By.xpath("//input[@id='fileInput']")).sendKeys("D:\\Selenium\\DEMOAPPS_SeleniumPractise.xlsx");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[name()='svg']")).click();  //This line is used for the tags which contains <svg>
	}

}
