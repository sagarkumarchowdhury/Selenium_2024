import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;



public class MultipleWIndows {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chorme.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		// Opens a new tab and switches to new tab
		driver.switchTo().newWindow(WindowType.TAB);

		// Opens a new window and switches to new window
//		driver.switchTo().newWindow(WindowType.WINDOW);

		driver.get("https://rahulshettyacademy.com");
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it = windows.iterator();
		String parentID = it.next();
		String childID = it.next();
//		driver.switchTo().window(childID)
		String name = driver
				.findElement(By.xpath("//div[@class='courses-block col-lg-3 col-md-4 col-sm-6 col-xs-12'][3] //h2//a"))
				.getText();
		driver.switchTo().window(parentID);
		driver.findElement(By.xpath("//label/following-sibling::input")).sendKeys(name);
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("D:\\Knowledge\\Screenshots\\test.png"));

	}

}
