package org.test;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Al {

	public static void main(String[] args) throws Exception {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver i=new ChromeDriver();
		i.get("http://demo.automationtesting.in/Alerts.html");
		//WebElement o=i.findElement(By.xpath("//button[@class='btn btn-danger']"));
		//o.click();
		//WebElement ale=i.findElement(By.xpath("//iframe[@id='google_esf']"));
		
		//a.accept();
		WebElement ca=i.findElement(By.xpath("(//a[@class='analystic'])[2]"));
		ca.click();
		WebElement ca1=i.findElement(By.xpath("//button[@class='btn btn-primary']"));
		ca1.click();
		WebElement ca2=i.findElement(By.xpath("//iframe[@id='google_esf']"));
		Alert a=i.switchTo().alert();
		Thread.sleep(5000);
		a.accept();
		//a.dismiss();
		i.quit();
		
	}
}
