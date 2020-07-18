package org.fra;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Framepract {
	public static void main(String[] args) {
		
		String si = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", si+"\\div\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		List<WebElement> ip = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		WebElement ip11 = ip.get(0);
		ip11.click();
		
		String wh = driver.getWindowHandle();
		
		Set<String> whs = driver.getWindowHandles();
		
		for(String x:whs) {
			if(!x.equals(wh)) {
				driver.switchTo().window(x);
				
			}
			
		}
		
		
		
		
	}

}
