package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextWorkout {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver dr=new ChromeDriver();
		dr.get("http://www.greenstechnologys.com/index.html");
		WebElement t=dr.findElement(By.xpath("//strong[contains(text(),'Balamurugan ')]"));
		String p=t.getText();
		System.out.println(p);
		WebElement t1=dr.findElement(By.xpath("//strong[contains(text(),'Okkiam')]"));
		String p1=t1.getText();
		System.out.println(p1);
		WebElement t2=dr.findElement(By.xpath("//strong[contains(text(),'oppt ')]"));
		String p2=t2.getText();
		System.out.println(p2);
		WebElement t3=dr.findElement(By.xpath("(//strong[contains(text(),'Jain ')])[2]"));
		String p3=t3.getText();
		System.out.println(p3);
		dr.quit();
		
		
		
				
	}

}
