package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScript1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement e = d.findElement(By.id("email"));
		WebElement p = d.findElement(By.id("pass"));
		WebElement b = d.findElement(By.id("loginbutton"));
		JavascriptExecutor j=(JavascriptExecutor)d;
		j.executeScript("arguments[0].setAttribute('value','udhaya')",e);
		j.executeScript("arguments[0].setAttribute('value','121345')",p);
		j.executeScript("arguments[0].click()",b);
		Object o = j.executeScript("return arguments[0].getAttribute('value')",p);
		String s=(String)o;
		System.out.println(s);
		
	}

}
