package Section1Assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flipkart_AddToCompare1_3_5_LastProduct {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver driver = new ChromeDriver();
Thread.sleep(3000);
driver.get("https://www.flipkart.com/");
driver.manage().window().maximize();
WebElement SearchTextfield = driver.findElement(By.xpath("//input[@class='Pke_EE']"));
SearchTextfield.sendKeys("Iphone 11");
SearchTextfield.submit();
Thread.sleep(3000);
List<WebElement> AddToCompareCheckbox = driver.findElements(By.xpath("//span[text()='Add to Compare']"));
for(int i=0;i<AddToCompareCheckbox.size();i++) 
{
	if( i==0||i==2||i==4||i==AddToCompareCheckbox.size()-1);
	{
		AddToCompareCheckbox.get(i).click();
		Thread.sleep(3000);
	}
	
}
AddToCompareCheckbox.get(22).click();
Thread.sleep(3000);
WebElement WarningMessage = driver.findElement(By.xpath("//div[text()='You have already selected 4 products']"));
if(WarningMessage.isDisplayed())
{
	System.out.println("More than 4 products not allowed");
}
else
{
	System.out.println("Items added to cart");
}
	}

}
