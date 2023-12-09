package basicSelenium;

import static org.testng.Assert.ARRAY_MISMATCH_TEMPLATE;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class DropdownOrListBox {
	@Test
	public static void main() throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("file:///C:/Users/asus/OneDrive/Desktop/ListBox.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		WebElement e=driver.findElement(By.id("mtr"));
		Select s = new Select(e);
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("kharabath");
		s.deselectByIndex(0);
		s.deselectByValue("v");
		s.deselectByVisibleText("kharabath");
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("kharabath");
		Thread.sleep(3000);
		s.deselectAll();
		
		boolean bb = s.isMultiple();
		System.out.println(bb);
		
		s.selectByIndex(0);
		s.selectByValue("v");
		s.selectByVisibleText("kharabath");
		WebElement first = s.getFirstSelectedOption();
		String fText = first.getText();
		System.out.println(fText);
		System.out.println();
		
		List<WebElement> all = s.getAllSelectedOptions();
		for(int i=0; i<all.size(); i++) {
			String text =all.get(i).getText();
			System.out.println(text);
		}
		System.out.println();
		List<WebElement> allop = s.getOptions();
		for (int i = 0; i < allop.size(); i++) {
			System.out.println(allop.get(i).getText());
		}
		
		System.out.println();
		WebElement allops = s.getWrappedElement();
		System.out.println(allops.getText());
		
	}
}
