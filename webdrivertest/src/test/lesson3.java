//get title or url
package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class lesson3 {

@Test
	public void test() throws InterruptedException{
	
	//chrom use driver like docker load 
    System.setProperty("webdriver.chrome.driver", "C:/8M/MyProj/webdrivertest/chromedriver.exe");
    WebDriver wd= new ChromeDriver();
    //fangwen yemian, huoqu title and url
    wd.get("https://www.baidu.com");
    System.out.println("This title is:"+wd.getTitle());
    System.out.println("Current URL is:"+wd.getCurrentUrl());
    wd.manage().window().maximize();
    Thread.sleep(3000);
    wd.close();

   }
}