package com.Ecommerce;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Ecommerce_greenkart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "D:\\Selenium New\\API\\Selenium_October_2024\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		// Matrix of array with each vegetable and the quantity to add
		String[] veges = { "Brocolli", "Cauliflower", "Tomato", "Potato", "Banana", "Onions" };
		String coupon = "rahulshettyacademy";
		addItems(driver, veges);
		gotoCart(driver);
		applyCoupon(driver, coupon);

	}

	public static void addItems(WebDriver driver, String[] veges) {
		List<WebElement> veges1 = driver.findElements(By.cssSelector("h4.product-name"));
		int j = 0;
		for (int i = 0; i < veges1.size(); i++) {
			String name = veges1.get(i).getText().split("-")[0].trim();
			List<String> items = Arrays.asList(veges);
			if (items.contains(name)) {

				j++;
				driver.findElements(By.xpath("//div[@class ='product-action']/button")).get(i).click();
				System.out.println("Added " + name);
				if (j == veges.length) {
					break;
				}
			}

		}
	}

	public static void gotoCart(WebDriver driver) {
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		driver.findElement(By.xpath("//button[text()='PROCEED TO CHECKOUT']")).click();
		Assert.assertEquals(driver.findElement(By.xpath("//button[text()='Place Order']")).getText(), "Place Order");
	}

	public static void applyCoupon(WebDriver driver, String coupon) {
		driver.findElement(By.className("promoCode")).sendKeys(coupon);
		driver.findElement(By.cssSelector(".promoBtn")).click();
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(10));
		explicitWait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
//		Assert.assertEquals(driver.findElement(By.cssSelector(".discountPerc")).getText(), "10%");
	}
}
