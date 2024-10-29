package com.Tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver",
				"D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		List<WebElement> rows = driver.findElements(By.cssSelector("table[name='courses'] tr"));
		System.out.println(rows.size());
		List<WebElement> columns = driver.findElements(By.cssSelector("table[name='courses'] tr th"));
		System.out.println(columns.size());
		System.out.println(driver.findElement(By.cssSelector("table[name='courses'] tr:nth-child(3)")).getText());

	}

}
