import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class E2EAllLocators {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
		driver.findElement(By.xpath("//a[@value='BLR']")).click();
		Thread.sleep(Duration.ofSeconds(1));
		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
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
		String value = driver.findElement(By.cssSelector("div[class='picker-second']")).getAttribute("style");
		if(value.contains("0.5")) {
			System.out.println("Is readonly");
			Assert.assertTrue(true);
		}
		
		driver.findElement(By.cssSelector("span[class='btn-find-flight-home'] input[type='submit']")).click();
		

	}

}
