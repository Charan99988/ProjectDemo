package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		//driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
		driver.findElement(By.cssSelector("*[name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("admin123");
	//	driver.findElement(By.xpath("//input[starts-with(@type,'password')]")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']")).click();
	}

}
