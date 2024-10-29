import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Session1 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("Sagar");
		driver.findElement(By.name("inputPassword")).sendKeys("hello123");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println((driver.findElement(By.cssSelector(".error")).getText()));
		driver.findElement(By.linkText("Forgot your password?")).click();
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sagar");
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sagar123@gmail.com");
		driver.findElement(By.cssSelector("input[placeholder='Phone Number']")).sendKeys("9876543210");
		driver.findElement(By.cssSelector("button.reset-pwd-btn")).click();
		String passwordPhrase = driver.findElement(By.cssSelector("p.infoMsg")).getText();
		String[] passwordSplit = passwordPhrase.split("'");
		for(String s :passwordSplit) {
			System.out.println(s);
		}
		String password = passwordSplit[1];
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		Thread.sleep(Duration.ofSeconds(5));
		driver.findElement(By.id("inputUsername")).sendKeys("Sagar");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		driver.findElement(By.cssSelector("//button[contains(@class,'submit')]")).click();
		driver.findElement(By.cssSelector("div[class ='login-container'] p"));
		String loginSuccess = driver.findElement(By.xpath("//div[@class ='login-container']/p")).getText();
		Assert.assertEquals(loginSuccess, "You are successfully logged in.");
		driver.findElement(By.cssSelector("button[class*='logout']")).click();
		
		
	}

}
