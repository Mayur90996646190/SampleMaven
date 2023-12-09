package basicSelenium;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class HeightAndWidth {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		WebElement logbt = driver.findElement(By.name("login"));
		int height = logbt.getSize().getHeight();
		int width = logbt.getSize().getWidth();
		boolean displayed = logbt.isDisplayed();
		boolean enable = logbt.isEnabled();
		boolean selected  = logbt.isSelected();
		System.out.println(height);
		System.out.println(width);
		System.out.println(displayed);
		System.out.println(enable);
		System.out.println(selected);
		int x = logbt.getLocation().getX();
		System.out.println(x);
		int x1 = driver.findElement(By.xpath("//a[@rel=\"async\"]")).getLocation().getX();
		System.out.println(x1);
		driver.findElement(By.name("email")).sendKeys("Mayur");
		driver.findElement(By.name("email")).sendKeys(Keys.CONTROL + "ac");
		driver.findElement(By.name("pass")).sendKeys(Keys.CONTROL+"av");
		String color = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("color");
		System.out.println(color);
		String font_size = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font-size");
		System.out.println(font_size);
		String font = driver.findElement(By.xpath("//a[text()='Forgotten password?']")).getCssValue("font");
		System.out.println(font);
	}
}
