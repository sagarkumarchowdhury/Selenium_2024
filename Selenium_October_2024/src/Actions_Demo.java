import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class Actions_Demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chorme.driver", "D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.cssSelector(".ac-input-container #twotabsearchtextbox"))).click().keyDown(Keys.SHIFT).sendKeys("MacBook").sendKeys(Keys.ENTER).build().perform();

	}

}
