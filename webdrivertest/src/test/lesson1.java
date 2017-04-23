//open web
package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;  // TestNG 

public class lesson1 {

@Test  
	public void test() throws InterruptedException{
//sever-standalone is selenium webdriver
//firefox, use bin load
	System.setProperty("webdriver.firefox.bin", "C:/Program Files/Mozilla Firefox/firefox.exe"); 
    WebDriver wd= new FirefoxDriver();
    Dimension size = new Dimension (480,720);
    wd.manage().window().setSize(size);
    wd.get("http://www.51cto.com/");
    wd.manage().window().maximize();
    Thread.sleep(4000);
    wd.close(); 
   }
}