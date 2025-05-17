package old_test;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicScript{
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(500));
		
		driver.get("https://admin-demo.nopcommerce.com/login");
		
		String title = driver.getTitle();
		System.out.println("Title is: "+title);
		
		WebElement emailBox = driver.findElement(By.id("Email"));
		WebElement passwordBox = driver.findElement(By.id("Password"));
		
		emailBox.clear();
		emailBox.sendKeys("admin@yourstore.com");
		
		passwordBox.clear();
		passwordBox.sendKeys("admin");
		driver.findElement(By.xpath("//button[text() = 'Log in']")).click();
		
		//driver.close();
		driver.quit();
	}

}
