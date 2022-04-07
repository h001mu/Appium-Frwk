package testScripts;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class S2 {

	public static void main(String[] args) throws Throwable {
		System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/popup.php");
		driver.manage().window().maximize();
		driver.findElement(By.partialLinkText("Click")).click();
		String MainWindowhandle = driver.getWindowHandle();
		Set<String> ChildWindowhandles = driver.getWindowHandles();
		for (String string : ChildWindowhandles) {
			
			if(!MainWindowhandle.equals(ChildWindowhandles)) {
				
				driver.switchTo().window(string);
				Thread.sleep(5000);
				
				driver.findElement(By.xpath("//input[@name='emailid']")).sendKeys("himanshu.yn@gmail.com");
				driver.findElement(By.name("btnLogin")).submit();
				Thread.sleep(5000);
				driver.close();
				
			
			 
			}
		}
		driver.switchTo().window(MainWindowhandle);
		
			
		}
		

	}


