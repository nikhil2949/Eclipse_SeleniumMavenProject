package Section2_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class HandlingMouseAction_ClickAndHoldOnCircleDemoapps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");
		
		WebElement button = driver.findElement(By.xpath("//section[text()='Mouse Actions']"));
		button.click();
		
		WebElement clickAndHoldOption = driver.findElement(By.xpath("//section[text()='Click & Hold']"));
		clickAndHoldOption.click();
		
		WebElement circleElement = driver.findElement(By.xpath("//div[@id='circle']"));
		
		Actions action = new Actions(driver);
		action.clickAndHold(circleElement).perform();
		action.release(circleElement).perform();
	}

}
