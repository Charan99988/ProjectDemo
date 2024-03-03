package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class5 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		driver.findElement(By.cssSelector("input#email")).sendKeys("xyz");
		driver.findElement(By.cssSelector("input[name='pass']")).sendKeys("abc123");
		Thread.sleep(5000);
		driver.findElement(By.cssSelector("#password")).click();

	}

}
