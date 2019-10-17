package org.test;

import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Wrkout {
	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver b=new ChromeDriver();
		b.get("https://www.facebook.com/ ");
		WebElement em=b.findElement(By.xpath("//i[@class='fb_logo img sp_nv0ywostZBX sx_a203a1']"));
		Actions a=new Actions(b);
		a.moveToElement(em).perform();
		Thread.sleep(5000);
		//a.doubleClick().perform();
		a.contextClick(em).perform();
		//b.quit();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
		
				
	}

}
