package org.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement day = d.findElement(By.id("day"));
		Select s=new Select(day);
		s.selectByIndex(3);
		s.selectByValue("6");
		s.selectByVisibleText("10");
		
	}

}
