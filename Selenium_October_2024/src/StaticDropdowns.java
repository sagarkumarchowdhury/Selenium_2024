import java.time.Duration;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class StaticDropdowns {
	
	
	
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		WebElement staticDropdown = driver.findElement(By.cssSelector("select#ctl00_mainContent_DropDownListCurrency"));
		Select dropdown = new Select(staticDropdown);
		Thread.sleep(Duration.ofSeconds(1));
		dropdown.selectByVisibleText("USD");
		driver.findElement(By.cssSelector("div#divpaxinfo")).click();
		int i=4;
		while(i<5) {
			driver.findElement(By.cssSelector("#hrefIncAdt")).click();
			Thread.sleep(Duration.ofSeconds(1));
			i++;
		}
		driver.findElement(By.cssSelector("#btnclosepaxoption")).click();
		
		
	

	}

}
