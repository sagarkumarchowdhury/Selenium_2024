import org.openqa.selenium.Proxy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class ChromeOptionsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver",
				"\"D:\\GIT\\Selenium_2024\\Selenium_October_2024\\chromedriver.exe\"");
		ChromeOptions options = new ChromeOptions();
		Proxy proxy = new Proxy();
		proxy.setHttpProxy("ipaddress: 4444");
		options.setCapability("proxy", proxy);
		WebDriver driver = new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://expired.badssl.com/");



	}

}
