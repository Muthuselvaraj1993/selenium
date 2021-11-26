package org.web;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class BrowserLaunch {
	




public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\SONY\\eclipse-workspace\\selenium\\Driver\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("https://demo.guru99.com/test/drag_drop.html");
	driver.manage().window().maximize();
	
	WebElement bank = driver.findElement(By.id("credit2"));
    WebElement account = driver.findElement(By.id("bank"));
    WebElement rupees = driver.findElement(By.id("fourth"));
    WebElement amount = driver.findElement(By.id("amt7"));
    WebElement sales = driver.findElement(By.id("credit1"));
    WebElement credit = driver.findElement(By.id("loan"));
    WebElement account1 = driver.findElement(By.id("fourth"));
    WebElement rupeespaid = driver.findElement(By.id("amt8"));
    Actions actions = new Actions(driver);
    actions.dragAndDrop(bank, account ).perform();
    actions.dragAndDrop(rupees, amount).perform();
    actions.dragAndDrop(sales, credit).perform();
    actions.dragAndDrop(account1, rupeespaid).perform();
	
    Thread.sleep(900);
    WebElement perfect = driver.findElement(By.id("equal"));
  String text = perfect.getText();
  System.out.println(text);
    

	
		
	
	}

}
