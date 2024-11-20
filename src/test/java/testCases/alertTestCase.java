package testCases;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;



public class alertTestCase {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().deleteAllCookies();
		
		
		driver.get("https://demoqa.com/alerts");
		
		WebElement AlertBtn = driver.findElement(By.id("alertButton"));
		
		AlertBtn.click();
		
		//accept alert 
		
		driver.switchTo().alert().accept();
		
		
		String pageTitle = driver.getTitle();
		System.out.println(pageTitle);
		
		
		
	}

}
