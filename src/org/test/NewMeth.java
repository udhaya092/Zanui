package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NewMeth {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.google.com/");
		WebElement g=d.findElement(By.name("q"));
		g.sendKeys("uan");
		WebElement s=d.findElement(By.xpath("(//input[@type='submit'])[3]"));
		s.click();
		WebElement uan=d.findElement(By.xpath("(//h3[@class='LC20lb'])[1]"));
		uan.click();
		
		
		
	}

}
