package basicSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class Allsugg {
	@Test
	public static void main()  {
		WebDriver  driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.titleContains(""));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.name("q")).sendKeys("java");
		List<WebElement> allsugg = driver.findElements(By.xpath("//span[contains(text(),'java')]"));
		 int count = allsugg.size();
		 System.out.println(count);
		 for(int i=0; i<count ; i++) {
			 String value = allsugg.get(i).getText();
			 System.out.println(value);
		 }
	}
}
