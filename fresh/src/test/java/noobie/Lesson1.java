package noobie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lesson1 {

	
		
		@Test
		public void openBrowser() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
			driver.close();
		}
		

	}

