package com.ppatel.selenm.trng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicSelectDropdown {
public static void main(String[] args){
	System.setProperty("webdriver.chrome.driver", "C://WebDriver/chromedriver.exe");
	WebDriver wd = new ChromeDriver();
	wd.get("http://spicejet.com/");
	wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_originStation1_CTXT']")).click();
	wd.findElement(By.xpath("//a[@value='GOI']")).click();
	System.out.println("1");
	System.out.println("2");
	//wd.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")).click();
	
	wd.findElement(By.xpath(".//*[@id='ctl00_mainContent_ddl_destinationStation1_CTNR']")).click();
	System.out.println("2");
	//wd.findElement(By.xpath("//a[@text='Varanasi (VNS)']")).submit();	
	//Select dropdown=new Select(wd.findElement(By.xpath("//*[@name='ctl00_mainContent_ddl_destinationStation1_CTXT']")));
	System.out.println("3");
	//dropdown.selectByVisibleText("Varanasi (VNS)");
	//dropdown.selectByValue("Varanasi (VNS)");
	System.out.println("4");
	Select adultdd = new Select (wd.findElement(By.xpath("//*[@id='ctl00_mainContent_ddl_Adult']")));
	adultdd.selectByIndex(4);
		
	}

}
