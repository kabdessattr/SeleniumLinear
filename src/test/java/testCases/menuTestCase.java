package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class menuTestCase {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://demoqa.com/menu");
		
		WebElement MainItem2 = driver.findElement(By.xpath("//a[normalize-space()='Main Item 2']"));
		
		Actions actions = new Actions(driver);
		
		actions.moveToElement(MainItem2).perform();
		
		WebElement Subitem2 = driver.findElement(By.xpath("//body/div[@id='app']/div[@class='body-height']/div[@class='container playgound-body']/div[@class='row']/div[@class='col-12 mt-4 col-md-6']/div[@class='nav-menu-container']/ul[@id='nav']/li/ul/li[2]/a[1]"));

		actions.moveToElement(Subitem2).perform();

		
	}

}
