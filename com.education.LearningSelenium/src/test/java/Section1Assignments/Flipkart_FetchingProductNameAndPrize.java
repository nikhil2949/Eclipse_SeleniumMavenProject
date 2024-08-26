package Section1Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_FetchingProductNameAndPrize {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		WebDriver driver= new ChromeDriver();
		Thread.sleep(3000);
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		WebElement SearchTextfield = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
		Thread.sleep(3000);
		SearchTextfield.sendKeys("Iphone 11");
		SearchTextfield.submit();
		Thread.sleep(3000);
		List<WebElement> ProductName = driver.findElements(By.xpath("//a[contains(text(),'Apple iPhone 11')]"));
		List<WebElement> ProductPrize = driver.findElements(By.xpath("//div[@class='Nx9bqj']"));
		for(int i=0;i<ProductName.size();i++)
		{
			String obj=ProductName.get(i).getText();
			String obj1=ProductPrize.get(i).getText();
			System.out.println(obj+"----->"+obj1);

		}
	}
}


