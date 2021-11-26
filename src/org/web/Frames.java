package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frames {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\SONY\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://netbanking.hdfcbank.com/netbanking/?_ga=2.31895230.1666400574.1636291632-67697560.1634478091");
		driver.manage().window().maximize();
		WebElement frameLogin = driver.findElement(By.xpath("//frame[@name='login_page']"));
		driver.switchTo().frame(frameLogin);
		WebElement username = driver.findElement(By.name("fldLoginUserId"));
		username.sendKeys("123456789",Keys.ENTER);
	    WebElement password = driver.findElement(By.name("fldPassword"));
	    password.sendKeys("987456321",Keys.ENTER);
		
	}

}
