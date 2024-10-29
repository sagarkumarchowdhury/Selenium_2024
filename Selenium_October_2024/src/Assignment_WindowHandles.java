import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_WindowHandles {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver", "D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/windows");
		driver.findElement(By.cssSelector(".example a")).click();
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID= it.next();
		String childID= it.next();
		driver.switchTo().window(childID);
		System.out.println(driver.findElement(By.cssSelector("h3")).getText());
		driver.switchTo().window(parentID);
		System.out.println(driver.findElement(By.cssSelector(".example h3")).getText());

	}

}
