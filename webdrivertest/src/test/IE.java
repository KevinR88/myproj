package test;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.Test;

public class IE {

@Test
	public void test() throws InterruptedException{
	
//IE use driver like docker load 
    System.setProperty("webdriver.ie.driver", "C:/8M/MyProj/webdrivertest/IEDriverServer.exe");
    WebDriver wd= new InternetExplorerDriver();
    wd.get("http://www.google.cn/");
    Dimension size = new Dimension (480,720);
    wd.manage().window().setSize(size);
    Thread.sleep(6000);
    wd.close();

   }
}