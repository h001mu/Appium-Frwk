package testScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.appium.java_client.events.api.Listener;



public class S1 {
	public static void main(String[] args) throws Throwable {
	System.setProperty("webdriver.chrome.driver", "./src/test/resources/Chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://demo.guru99.com/test/delete_customer.php");
	driver.findElement(By.name("cusid")).sendKeys("53920");
	driver.findElement(By.name("submit")).click();
	Alert alert = driver.switchTo().alert();
	
	String alertmessage = driver.switchTo().alert().getText();
System.out.println(alertmessage);
Thread.sleep(5000);
alert.accept();
    
    
    




	}
}
	
		