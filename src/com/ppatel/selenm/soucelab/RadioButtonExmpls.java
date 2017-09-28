package com.ppatel.selenm.soucelab;

import org.openqa.selenium.By;
//import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtonExmpls {

	public static void main(String[] args) {213	`
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C://WebDriver/chromedriver.exe");
		WebDriver dc = new ChromeDriver();
		dc.get("http://echoecho.com/htmlforms10.htm");
		dc.findElement(By.xpath("//input[@value='Milk']")).click();
		System.out.println(dc.findElements(By.xpath("//input[@name='group1']")).size());
		dc.close();
		
	}

}
