package Section1Assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMyTrip_FetchingPrizeOfHighlightedDate {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.makemytrip.com/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//span[@class='commonModal__close']")).click();     //Closes the popup
		Thread.sleep(3000);
		driver.findElement(By.xpath("//label[@for='departure']")).click();
		Thread.sleep(3000);
	String TodayPrize = driver.findElement(By.xpath("//div[@class='DayPicker-Day DayPicker-Day--selected']/descendant::p[text()='₹ 5,195']")).getText();
	System.out.println("Today's prize is:"+TodayPrize);
	}

}
