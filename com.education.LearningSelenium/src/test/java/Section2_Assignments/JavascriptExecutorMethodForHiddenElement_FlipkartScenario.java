package Section2_Assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavascriptExecutorMethodForHiddenElement_FlipkartScenario {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		WebElement loginLink = driver.findElement(By.xpath("//span[text()='Login']"));
		Actions action=new Actions(driver);
		action.moveToElement(loginLink).perform();
		Object homeAndKitchenOption = driver.findElement(By.xpath("//span[text()='Home & Kitchen']"));
		JavascriptExecutor jse =(JavascriptExecutor)driver;
		Thread.sleep(3000);
		jse.executeScript("arguments[0].click();", homeAndKitchenOption);
		
	}

}
