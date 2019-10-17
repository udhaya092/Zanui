package org.zanui;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Zanui {
	public static void main(String[] args) throws InterruptedException, Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver d=new ChromeDriver();
		d.get("https://www.zanui.com.au/");
		Thread.sleep(5000);
		WebElement f = d.findElement(By.xpath("(//a[@class='w-tab-link w-inline-block header-link ga-track-link-click'])[1]"));
		Actions a=new Actions(d);
		a.doubleClick(f).perform();
		WebElement f1 = d.findElement(By.xpath("//h1[@class='product-listing-heading']"));
		a.contextClick(f1).perform();
		Robot r=new Robot();
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_DOWN);
		r.keyRelease(KeyEvent.VK_DOWN);
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);
	}

}
