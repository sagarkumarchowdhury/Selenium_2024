package com.Tests;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class Assignment8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chorme.driver",
				"\"D:\\GIT\\Selenium_2024\\Selenium_October_2024\\chromedriver.exe\"");
		WebDriver driver = new ChromeDriver();
		String inputValue= "Uni";
		String selectedValue = "United Kingdom (UK)";
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		driver.findElement(By.cssSelector(".ui-autocomplete-input")).sendKeys(inputValue);
		WebDriverWait explicitWait = new WebDriverWait(driver, Duration.ofSeconds(5));
		explicitWait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(".ui-menu.ui-widget"))));
		List<WebElement> list = driver.findElements(By.cssSelector(".ui-menu li"));
		Actions act = new Actions(driver);

		for (int i = 0; i < list.size(); i++) {
			if (list.get(i).getText().contains(selectedValue)) {
				act.moveToElement(list.get(i)).click().build().perform();
				break;

			}

		}
		Assert.assertEquals(driver.findElement(By.cssSelector(".ui-autocomplete-input")).getAttribute("value"), selectedValue);
		
	}
}
