import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandles {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver", "D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/loginpagePractise/#/");
		driver.findElement(By.cssSelector("body .blinkingText")).click();
		Set<String> windows= driver.getWindowHandles();
		Iterator<String> it= windows.iterator();
		String parentID= it.next();
		String childID = it.next();
		driver.switchTo().window(childID);
		String email= driver.findElement(By.cssSelector(".im-para.red  a")).getText();
		driver.switchTo().window(parentID);
		driver.findElement(By.cssSelector("#username")).sendKeys(email);
		

	}

}
