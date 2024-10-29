import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Frames_Demo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver", "D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://jqueryui.com/droppable/");
		Thread.sleep(Duration.ofSeconds(2));
		driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
		Actions act = new Actions(driver);
		act.dragAndDrop(driver.findElement(By.cssSelector("#draggable p")), driver.findElement(By.cssSelector("body #droppable"))).build().perform();
		// Control is still in the iFrame. To move back to the main page, we have to switch to .defaultContent()
		driver.switchTo().defaultContent();

	}

}
