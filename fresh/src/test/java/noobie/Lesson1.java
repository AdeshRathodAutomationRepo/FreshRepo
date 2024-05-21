package noobie;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Lesson1 {

	
		
		@Test
		public void openBrowser() {
			WebDriver driver = new ChromeDriver();
			driver.get("https://mvnrepository.com/artifact/org.testng/testng/7.7.1");
			System.out.println("hey");
			System.out.println("I'm making");
			System.out.println("I'm making hehe");
			
			driver.close();
		}
		

	}

