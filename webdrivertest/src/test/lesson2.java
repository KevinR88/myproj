//max window or set size
package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lesson2 {

@Test
	public void test() throws InterruptedException{
	
	//chrom use driver like docker load 
    System.setProperty("webdriver.chrome.driver", "C:/8M/MyProj/webdrivertest/chromedriver.exe");
    WebDriver wd= new ChromeDriver();
    
    //Dimension is a method for windows size and will import sth
    Dimension size = new Dimension (320,480);
    wd.manage().window().setSize(size);
    wd.manage().window().maximize();
    Thread.sleep(3000);
    wd.close();

   }
}