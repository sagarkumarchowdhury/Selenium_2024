import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class FullFormAssignment {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("Sagar");
		driver.findElement(By.name("email")).sendKeys("sagar123@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("helloworld123");
		driver.findElement(By.cssSelector("div[class='form-check'] input[class='form-check-input']")).click();
		WebElement dropdown = driver.findElement(By.xpath("//select[@class='form-control']"));
		Select gender = new Select(dropdown);
		gender.selectByVisibleText("Male");
		driver.findElement(By.cssSelector("#inlineRadio2")).click();
		driver.findElement(By.xpath("//input[@name='bday']")).sendKeys("15051996");
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		Thread.sleep(Duration.ofSeconds(2));
		System.out.println(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).getText());
		Assert.assertTrue(driver.findElement(By.cssSelector(".alert.alert-success.alert-dismissible")).isDisplayed());
		
		
		

	}

}
