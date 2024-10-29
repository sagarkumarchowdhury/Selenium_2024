import org.openqa.selenium.Cookie;
import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class DeleteCookiesTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver",
				"\"D:\\GIT\\Selenium_2024\\Selenium_October_2024\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		Cookie l = new Cookie("SSID", "Avc7WURT4HXSX4S4E");
		driver.manage().deleteCookie(l);
		driver.manage().deleteCookieNamed("Sagar");
		Cookie ck = new Cookie("name", "value");
		driver.manage().addCookie(ck);
		driver.get("https://expired.badssl.com/");


	}

}
