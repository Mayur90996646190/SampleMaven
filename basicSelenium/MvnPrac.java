package basicSelenium;

import org.testng.annotations.Test;

public class MvnPrac {
	@Test
	public static void main() {
		String browser = System.getProperty("browser");
		String name = System.getProperty("name");
		System.out.println(name);
		System.out.println(browser);
		//mvn -Dbrowser=chrome -Dname=mayur -Dtest=MvnPrac test
	}
}
