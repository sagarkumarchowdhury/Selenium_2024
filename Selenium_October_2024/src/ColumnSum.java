import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ColumnSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.driver",
				"D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> values = driver.findElements(By.cssSelector(".tableFixHead #product td:nth-child(4)"));
		int sum = 0;
		for (int i = 0; i < values.size(); i++) {
			sum = sum + Integer.parseInt(values.get(i).getText());

		}
		System.out.println(sum);

	}

}
