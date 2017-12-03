package com.automation.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestCheckBox {

public static void main(String args[]){
	
	WebDriver driver;
	String path="c://chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	driver=new ChromeDriver();
	
	
	driver.get("https://www.facebook.com");
	
	
}

}
