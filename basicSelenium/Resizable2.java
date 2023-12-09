package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable2 {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		WebElement resizableElement = driver.findElement(By
				.xpath("//textarea[@ng-model=\"Adress\"]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(resizableElement).perform();
		actions.moveByOffset(150, 100).perform();
		actions.release().perform();
	}
}
