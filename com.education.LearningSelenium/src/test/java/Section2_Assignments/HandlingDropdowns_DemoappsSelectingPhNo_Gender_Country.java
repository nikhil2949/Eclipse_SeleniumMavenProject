package Section2_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdowns_DemoappsSelectingPhNo_Gender_Country {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		driver.findElement(By.xpath("//section[text()='Dropdown']")).click();
		WebElement phonenumDropdown = driver.findElement(By.xpath("//select[@id='select1']"));
Select s = new Select(phonenumDropdown);
s.selectByIndex(1);
Thread.sleep(3000);
WebElement genderDropdown = driver.findElement(By.xpath("//select[@id='select2']"));
Select s1 = new Select(genderDropdown);
s1.selectByValue("male");
Thread.sleep(3000);
WebElement countryDropdown = driver.findElement(By.xpath("//select[@id='select3']"));
Select s2 = new Select(countryDropdown);
s2.selectByVisibleText("India"); 
	}

}
