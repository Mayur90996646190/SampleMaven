package basicSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Resizable.html");
		WebElement resizableElement = driver.findElement(By
				.xpath("//div[@class=\"ui-resizable-handle ui-resizable-se ui-icon ui-icon-gripsmall-diagonal-se\"]"));
		Actions actions = new Actions(driver);
		actions.clickAndHold(resizableElement).perform();
		actions.moveByOffset(200, 200).perform();
		actions.release().perform();
//		actions.dragAndDropBy(resizableElement, 200, 200).perform();
	}
}
