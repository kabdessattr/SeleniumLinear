package testCases;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://demoqa.com/browser-windows");
		
		String handle = driver.getWindowHandle();
		System.out.println(handle);
		
		WebElement newWindowButton = driver.findElement(By.xpath("//button[@id='windowButton']"));
		
		newWindowButton.click();
		
		Set<String> handles = driver.getWindowHandles();
		
		// Pass a window handle to other window
		for (String handle1 : driver.getWindowHandles()) {
		driver.switchTo().window(handle1);
		System.out.println(handle1);
				}
				
				driver.close();
		
	}

}
