package testCases;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElementCommand {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.saucedemo.com/");
		
		WebElement username = driver.findElement(By.xpath("//input[@id='user-name']"));
		WebElement password = driver.findElement(By.xpath("//input[@id='password']"));
		WebElement login = driver.findElement(By.xpath("//input[@id='login-button']"));
		
		username.clear();
		username.sendKeys("standard_user");
		
		password.clear();
		password.sendKeys("secret_sauce");
		
		String addValue = username.getAttribute("name");
		System.out.println(addValue);
		
		//size of element
		org.openqa.selenium.Dimension dimension = login.getSize();
		System.out.println("Height is :" + dimension.height);
		System.out.println("Width is :" + dimension.width);
		
		
		// locate element	
		Point point = username.getLocation();
		System.out.println("X location is :" + point.x);
		
		//vérifier un élément affiché
		boolean result1 = username.isDisplayed();
		System.out.println("The result is :" + result1);

		//vérifier un élément actif
		boolean result2 = username.isEnabled();
		System.out.println("The result is :" + result1);
		
		
		//vérifier un élément existe
		List<WebElement> loginBtn = driver.findElements(By.id("login-button"));
		if (loginBtn.size() != 0) {
			System.out.println("The element exists");

		} else {
			System.out.println("The element does not exist");
		}

		
		System.out.println("The result is :" + result1);
		
		
		
		
		
		login.click();
		
	}

}
