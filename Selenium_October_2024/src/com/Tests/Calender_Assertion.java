package com.Tests;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Calender_Assertion {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chorme.driver",
				"D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		String day = "15";
		String month = "06";
		String year = "2027";
		String date1 = year+"-"+month+"-"+day;
		System.out.println(date1);
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/offers");
		Thread.sleep(Duration.ofSeconds(2));
		driver.findElement(By.cssSelector(".react-date-picker__inputGroup")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label span")).click();
		driver.findElement(By.cssSelector(".react-calendar__navigation__label span")).click();
		WebElement yearPicker = driver.findElement(By.xpath("//div[@class='react-calendar__decade-view__years']"));
		for(int i=0; i<10;i++) {
			String year1 = yearPicker.findElements(By.xpath("//div[@class='react-calendar__decade-view__years']/button")).get(i).getText();
			if(year1.contains(year)) {
				yearPicker.findElements(By.xpath("//div[@class='react-calendar__decade-view__years']/button")).get(i).click();
				break;
			}
			
		}
		driver.findElement(By.xpath("//div[@class='react-calendar__year-view__months']")).findElements(By.xpath("//div[@class='react-calendar__year-view__months']/button")).get(Integer.parseInt(month)-1).click();
		
		driver.findElement(By.xpath("//div[@class='react-calendar__month-view__days']")).findElements(By.xpath("//div[@class='react-calendar__month-view__days']/button")).get(Integer.parseInt(day)).click();
		
		String date = driver.findElement(By.xpath("//div[@class='react-date-picker__inputGroup']/input")).getAttribute("value");

		System.out.println(date);
		if(date.contains(date1)) {
			System.out.println("Correct date has been selected");
		}
			
			
			
		}

	

}
