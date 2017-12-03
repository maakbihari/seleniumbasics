package com.automation.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestUrlAndOthers {

public static void main(String args[]){

	WebDriver driver;
	//Giving the path of the web driver where its kept in you local
	
	String path="c://chromedriver.exe";
   
	//Setting the property of the browser which you want CHROME OR FIREFOX OR SO ON..
    System.setProperty("webdriver.chrome.driver", path);
    
    driver=new ChromeDriver();//Initialize the driver object defaultl chrome will be launched.
    //this is used to open the URL you want
    driver.get("https://www.google.co.in");
    
    String Url= driver.getCurrentUrl();//Return current Url
    System.out.println(Url);//Print the URL
    String title=driver.getTitle();//Return the title of the page
    System.out.println(title);//print the Title
    driver.close();//close the open instance of the browser focusing
}
}