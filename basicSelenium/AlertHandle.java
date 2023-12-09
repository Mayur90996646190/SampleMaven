package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class AlertHandle {
	@Test
	public static void main() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//		wait.until(ExpectedConditions.alertIsPresent()); time out exception
		driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']")).click();
		driver.findElement(By.xpath("//button[text()='click the button to display a confirm box ']")).click();
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		Alert a =driver.switchTo().alert();
		String text = a.getText();
		System.out.println(text);
		a.dismiss();
		//.switchTo().newWindow(WindowType.WINDOW);
	}
}
