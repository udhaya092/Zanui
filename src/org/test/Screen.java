package org.test;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screen {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver n=new ChromeDriver();
		n.get("https://www.google.com/");
		WebElement se=n.findElement(By.name("q"));
		se.sendKeys("facebook");
		TakesScreenshot t=(TakesScreenshot)n;
		File s=t.getScreenshotAs(OutputType.FILE);
		File d=new File("E:\\new\\fb2.jpg");
		System.out.println(d);
		FileUtils.copyFile(s, d);
		n.quit();
	}

}
