package org.hex;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Sep {
	@Parameters({"userName","password"})
	@Test
	private void test1(String s1,String s2) {
		
		System.out.println(s1);
		System.out.println(s2);
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.facebook.com/");
		WebElement u = d.findElement(By.id("email"));
		u.sendKeys(s1);
		WebElement p = d.findElement(By.id("pass"));
		p.sendKeys(s2);
		WebElement b = d.findElement(By.id("loginbutton"));
		b.click();
	}
	
	
	
	
		
	}


