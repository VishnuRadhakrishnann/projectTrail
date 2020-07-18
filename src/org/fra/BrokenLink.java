package org.fra;

import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;

import javax.net.ssl.HttpsURLConnection;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrokenLink {
	public static void main(String[] args) throws Throwable {
		
		String si = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", si+"\\div\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		
		List<WebElement> alllink = driver.findElements(By.tagName("a"));
	
		for(int i=0;i<alllink.size();i++) {
		WebElement eachlink = alllink.get(i);
		String link = eachlink.getAttribute("href");
		URL u=new URL(link);
		URLConnection ul = u.openConnection();
	    HttpsURLConnection http=(HttpsURLConnection)ul;
	    int rc = http.getResponseCode();
	    if(rc!=200) {
	    	System.out.println(link);
	    }
		
		
	}
		System.out.println(alllink.size());
		
		
	}
	    
	
}
