package week3.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import static util.ConfigReader.getEmail;
import static util.ConfigReader.getPassword;

import java.io.IOException;

public class SampleAutomation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "/Users/keshavpandiyan/Downloads/chromedriver-mac-arm64/chromedriver");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.id("email")).sendKeys(getEmail());
		driver.findElement(By.id("pass")).sendKeys(getPassword());
		
		driver.findElement(By.name("login")).click();
		
		
		
		

	}

}
 