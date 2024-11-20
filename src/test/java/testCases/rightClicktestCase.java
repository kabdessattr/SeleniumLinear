package testCases;

import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class rightClicktestCase {
	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/buttons");
		
		driver.manage().deleteAllCookies();
		
		//instantiate Actions class
		
		Actions actions = new Actions(driver);
		
		WebElement btnRightClick = driver.findElement(By.id("rightClickBtn"));
		actions.contextClick(btnRightClick).build().perform();

		
		String text = driver.findElement(By.id("rightClickMessage")).getText();
		
		Assertions.assertEquals(text, "You have done a right click");
		
		
		
	}
}
