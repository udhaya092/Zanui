package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Test1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement org=d.findElement(By.xpath("//a[@class='gb_z gb_sc']"));
		org.click();
		WebElement map=d.findElement(By.xpath("//span[text()='YouTube']"));
		Actions a=new Actions(d);
		a.moveToElement(map).perform();
		a.click(map).perform();
		
	}

}
