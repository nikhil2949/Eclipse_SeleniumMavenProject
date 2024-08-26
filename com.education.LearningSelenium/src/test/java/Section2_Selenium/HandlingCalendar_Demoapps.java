package Section2_Selenium;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCalendar_Demoapps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Date & Time Picker']")).click();
		driver.findElement(By.xpath("//section[text()='Date Picker']")).click();
		Calendar cal=Calendar.getInstance();
		Date d=cal.getTime();
		System.out.println(d);
		SimpleDateFormat sdf=new SimpleDateFormat("dd-MM-YYYY");
		 String dateStamp=sdf.format(d);
		 System.out.println(dateStamp);
	WebElement DateTextfield = driver.findElement(By.xpath("//input[@placeholder='Select A Date']"));
	DateTextfield.sendKeys(dateStamp);

	}

}
