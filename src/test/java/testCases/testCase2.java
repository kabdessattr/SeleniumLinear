package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class testCase2 {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		//implicit wait 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		//maximize window
		driver.manage().window().maximize();

		//delete cookies
		driver.manage().deleteAllCookies();

		//get URL
		driver.get("https://www.saucedemo.com/");

		//fill username
		WebElement username = driver.findElement(By.id("user-name"));
		username.clear();
		username.sendKeys("standard_user");

		//fill password
		WebElement password = driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("secret_sauce");

		//click on submit button
		//WebElement loginBtn = driver.findElement(By.xpath("//input[@type='submit']"));
		//loginBtn.click();


		//Click submit button using explicit wait
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@type='submit']")));
		loginBtn.click();

		//kill session 
		//driver.quit();



	}

}
