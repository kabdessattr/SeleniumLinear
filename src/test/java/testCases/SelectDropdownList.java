package testCases;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectDropdownList {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://demoqa.com/select-menu");
		
	//	WebElement dropdownMenu = driver.findElement(By.id("oldSelectMenu"));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(15));
		WebElement dropdownMenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("oldSelectMenu")));
		
		Select dropdownList = new Select(dropdownMenu);
		
		
		
		//select by index
		
		//dropdownList.selectByIndex(3);
		
		//select by value 
		
		//dropdownList.deselectByValue("1");
		
		//select by visible text
		
		dropdownList.selectByVisibleText("Magenta");
		
		
		
		
	}

}
