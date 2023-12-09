package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class FramePractise {
	@Test
	public static void main()  {
		WebDriver driver = new ChromeDriver();
		driver.get("https://chercher.tech/practice/frames");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.switchTo().frame("frame1");
		WebElement ele = driver.findElement(By.xpath("//input[@type=\"text\"]"));
		ele.sendKeys("Mayur");
		driver.switchTo().frame("frame3");
		driver.findElement(By.xpath("//input[@id=\"a\"]")).click();
	//	driver.switchTo().defaultContent();
		driver.switchTo().parentFrame();
		driver.switchTo().parentFrame();
		driver.switchTo().frame("frame2");
		WebElement listbox = driver.findElement(By.id("animals"));
		Select s = new Select(listbox);

		WebElement wb = s.getWrappedElement();
		String text = wb.getText();
		System.out.println(text);
		
	}
}
