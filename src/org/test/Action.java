package org.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Action {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\udhaya\\Documents\\Test\\driver\\chromedrive.exe");
		WebDriver g=new ChromeDriver();
		g.get("http://www.greenstechnologys.com/");
		WebElement text=g.findElement(By.xpath("//h2[text()='Greens Technologys Overall Reviews']"));
		String p=text.getText();
		System.out.println(p);
		WebElement con=g.findElement(By.xpath("//h2[contains(text(),'Overall ')]"));
		String p1=con.getText();
		System.out.println(p1);
		g.quit();
		
		
	}

}
