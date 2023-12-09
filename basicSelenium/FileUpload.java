package basicSelenium;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FileUpload {
	@Test
	public static void main()   {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/FileUpload.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		File f = new File(".\\Jenkins1.png");
		String ab = f.getAbsolutePath();
		driver.findElement(By.xpath("//input[contains(@id,'input')]")).sendKeys(ab);
		
	}
}
