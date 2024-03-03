package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Class1 {

	public static void main(String[] args) {
		//System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://login.salesforce.com/?locale=in");
		driver.manage().window().maximize();
		
		//username
		driver.findElement(By.xpath("html/body/div/div/div/div/div[2]/div[3]/form/div/div/input")).sendKeys("Admin");
		driver.findElement(By.xpath("html/body/div/div/div/div/div[2]/div[3]/form/input[2]")).sendKeys("admin123");
		driver.findElement(By.xpath("html/body/div/div/div/div/div[2]/div[3]/form/input[3]")).click();
	}
	

}
