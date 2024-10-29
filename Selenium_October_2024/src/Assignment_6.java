import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class Assignment_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver",
				"D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector("#checkBoxOption2")).click();
		String selected = driver.findElement(By.cssSelector("label[for='benz']")).getText();
		WebElement dropdown = driver.findElement(By.cssSelector("#dropdown-class-example"));
		Select sel = new Select(dropdown);
		sel.selectByVisibleText(selected);
		driver.findElement(By.id("name")).sendKeys(selected);
		driver.findElement(By.cssSelector("#alertbtn")).click();
		String check = driver.switchTo().alert().getText();
		if (check.contains(selected)) {
			System.out.println("Correct");
			driver.switchTo().alert().accept();
		} else
			System.out.println("Wrong");

	}

}
