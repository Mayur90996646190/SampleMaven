package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsClass {
	@Test
	public static void main() {
		fcsdc
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.vtiger.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		Actions a = new Actions(driver);
		WebElement ele = driver.findElement(By.xpath("//a[contains(text(),'Resources')]"));
		a.moveToElement(ele).perform();
		WebElement ele1 = driver.findElement(By.xpath("//a[contains(text(),'Resources')]/parent::li/descendant::a[contains(text(),'Contact Us')]"));
		a.contextClick(ele1).perform();
		
	}
}
