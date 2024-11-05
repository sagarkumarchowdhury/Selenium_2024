import java.util.List;
import java.util.stream.Collectors;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.testng.Assert;

public class WebTableSortingUsingStreams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"D:\\GIT\\Selenium_2024\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");

		// click on column
		driver.findElement(By.xpath("//table[@class='table table-bordered'] //th[1]")).click();

		// capture all the element in the column
		List<WebElement> column = driver.findElements(By.xpath("//tr/td[1]"));

		// Scan the name columns and get the discounted price of Beans
		List<String> price = column.stream().filter(s -> s.getText().contains("Beans")).map(s -> getVeggiePrice(s))
				.collect(Collectors.toList());
		System.out.println(price);

		// Scan the name columns and get the discounted price of all elements
		column.stream().map(s -> getVeggiePrice(s)).collect(Collectors.toList()).forEach(s -> System.out.println(s));

		// capture the text of all the web-elements
		List<String> originalList = column.stream().map(s -> s.getText()).collect(Collectors.toList());

		// Sort the original list
		List<String> newList = originalList.stream().sorted().collect(Collectors.toList());

		// Compare the new list with the original list to compare
		Assert.assertTrue(originalList.equals(newList));

		// Get the price of rice which is on the last page
		List<String> price1;
		do {
			List<WebElement> column1 = driver.findElements(By.xpath("//tr/td[1]"));
			price1 = column1.stream().filter(s -> s.getText().contains("Rice")).map(s -> getVeggiePrice(s))
					.collect(Collectors.toList());
			if (price1.size() < 1) {
				driver.findElement(By.cssSelector("a[aria-label ='Next']")).click();
			}
		} while (price1.size() < 1);

	}

	public static String getVeggiePrice(WebElement element) {
		String price = element.findElement(By.xpath("following-sibling::td/following-sibling::td")).getText();
		return price;

	}

}
