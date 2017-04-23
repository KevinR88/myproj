package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;


public class chromepro {

@Test
	public void test() throws InterruptedException{
	
    System.setProperty("webdriver.chrome.driver", "C:/8M/MyProj/webdrivertest/chromedriver.exe");
    ChromeOptions Options = new ChromeOptions();
    Options.addArguments("user-data-dir=C:/Users/JIANRZHA/AppData/Local/Google/Chrome/User Data");
    WebDriver wd= new ChromeDriver(Options); 
    wd.get("http://home.51cto.com");
    Thread.sleep(3000);
    Dimension size = new Dimension (320,480);
    wd.manage().window().setSize(size); 
    wd.manage().window().maximize();
    Thread.sleep(3000);
    wd.findElement(By.name("login-button")).click();
    Thread.sleep(5000);
    wd.close();
   }

}