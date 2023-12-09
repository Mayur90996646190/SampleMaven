package basicSelenium;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class WindowAndTab{
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@id='Tabbed']/descendant::button[contains(text(),'click')]")).click();
		driver.manage().window().maximize();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open New Seperate Windows']")).click();
		driver.findElement(By.xpath("//div[@id='Seperate']/button[text()='click']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//a[text()='Open Seperate Multiple Windows']")).click();
		driver.findElement(By.xpath("//p[text()='Click the button to open multiple windows ']/following-sibling::button")).click();
		
		Set<String> allwh = driver.getWindowHandles();
		int size = allwh.size();
		System.out.println(size);
		ArrayList<String> ls = new ArrayList<String>(allwh);
		
		int win = 3;
		int count = 0;
		for(int i=0; i<size; i++) {
			driver.switchTo().window(ls.get(i));
			count++;
			if(win==count) {
				System.out.println(ls.get(i));
				break;
			}
		}
//		String exptitle  = "";
//		for(String wh : allwh)
//		{
//			driver.switchTo().window(wh);
//			String title=driver.getTitle();
//			System.out.println(title);
//			if(title.equalsIgnoreCase(exptitle)) {
//				break;
//			}
//		}
		System.out.println();
		System.out.println("Adresses of elements");
		for (String str : ls) {
			System.out.println(str);
		}
		
	}
}
