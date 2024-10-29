import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class CheckBoxAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertTrue(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).click();
		Assert.assertFalse(driver.findElement(By.xpath("//input[@id=\"checkBoxOption1\"]")).isSelected());
		
		// Count
		
		
		int count = driver.findElements(By.cssSelector("#checkbox-example input[type*='checkbox']")).size();
		System.out.println(count);
			
			
		}
		
		
		//#checkbox-example input[type*='checkbox']

	}


