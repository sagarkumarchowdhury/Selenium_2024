package com.TotalLinks;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.*;
import org.openqa.selenium.interactions.Actions;

public class TotalLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chorme.driver", "D:\\\\Selenium New\\\\API\\\\Selenium_October_2024\\\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		Actions act = new Actions(driver);
		WebElement driver1 = driver.findElement(By.cssSelector("body #gf-BIG"));
		System.out.println(driver1.findElements(By.tagName("a")).size());
		WebElement FooterTable1 = driver.findElement(By.xpath("//div[@id='gf-BIG'] //td[1]"));
		for(int i=1; i<FooterTable1.findElements(By.tagName("a")).size() ;i++) {
			act.moveToElement(FooterTable1.findElements(By.xpath("//li[@class='gf-li'] //a")).get(i)).keyDown(Keys.CONTROL).click().build().perform();
			
		}
		Set<String> windows = driver.getWindowHandles();
		Iterator<String> it =windows.iterator();
		while(it.hasNext()) {
			System.out.println(driver.switchTo().window(it.next()).getTitle());
		}
		
		

	}

}
