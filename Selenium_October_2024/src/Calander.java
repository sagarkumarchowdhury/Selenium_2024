import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Calander {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
//		driver.findElement(By.xpath("//a[@value='BLR']")).click();
//		Thread.sleep(Duration.ofSeconds(1));
//		driver.findElement(By.cssSelector("div[id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] a[value='MAA']")).click();
//		Thread.sleep(Duration.ofSeconds(2));
//		driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight")).click();
		String value= driver.findElement(By.cssSelector("div[class='picker-second']")).getAttribute("style");
		if(value.contains("0.5")) {
			System.out.println("Is readonly");
		}
		driver.findElement(By.cssSelector("div[class='picker-second']")).click();
		String value1= driver.findElement(By.cssSelector("div[class='picker-second']")).getAttribute("style");
		if(value1.contains("1")) {
			System.out.println("Is enabled");
		}
		
	}

}
