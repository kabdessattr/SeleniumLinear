package testCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchCommand {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		//driver.get("https://demo.guru99.com/test/guru99home/");
		
		//WebElement image = driver.findElement(By.xpath("//iframe[@id='a077aa5e']"));
		
		//image.click();
		

		driver.get("https://www.rediff.com/");
		
		driver.switchTo().frame("moneyiframe");
		
		WebElement option = driver.findElement(By.id("nseindex"));
		
		String test = option.getText();
		
		System.out.println("The value " + test);
		
		driver.switchTo().defaultContent();
		
	}

}
