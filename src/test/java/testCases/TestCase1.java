package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCase1 {

	public static void main(String[] args) throws InterruptedException {

		//Open Chrome 
		WebDriver driver = new ChromeDriver();

		//Get url APP
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

		//Wait 3 sec
		Thread.sleep(3000);

		//Fill username
		driver.findElement(By.name("username")).sendKeys("Admin");

		//Fill password
		driver.findElement(By.name("password")).sendKeys("admin123");

		//Click on Login btn
		driver.findElement(By.xpath("//button[@type='submit']")).click();

		//Kill session
		driver.quit();
	}

}
