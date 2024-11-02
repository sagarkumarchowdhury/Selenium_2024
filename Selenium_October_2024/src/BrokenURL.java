import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.URISyntaxException;
import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class BrokenURL {

	public static void main(String[] args) throws IOException, URISyntaxException, InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver",
				"\"D:\\GIT\\Selenium_2024\\Selenium_October_2024\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> links = driver.findElements(By.cssSelector("li[class='gf-li'] a"));
		for (WebElement link : links) {
			String url = link.getAttribute("href");
			HttpURLConnection conn = (HttpURLConnection) new URI(url).toURL().openConnection();
			conn.setRequestMethod("HEAD");
			conn.connect();
			Thread.sleep(Duration.ofSeconds(2));
			int respCode = conn.getResponseCode();
			System.out.println(url);
			System.out.println(respCode);
			if (respCode > 403) {
				System.out.println("Brokern link is "+link.getText()+"");
				Assert.assertTrue(false);
			}
		}

	}

}
