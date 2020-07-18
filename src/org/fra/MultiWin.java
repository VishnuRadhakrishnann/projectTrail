package org.fra;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;

import javax.print.DocFlavor.STRING;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultiWin {
public static void main(String[] args) throws Exception {
		
		String si = System.getProperty("user.dir");
		System.setProperty("webdriver.chrome.driver", si+"\\div\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Iphone");
		driver.findElement(By.xpath("(//input[@type='submit'])[1]")).click();
		
		List<WebElement> ip = driver.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));

		ip.get(0).click();
		ip.get(1).click();
		ip.get(2).click();
		
		Thread.sleep(3000);
		Set<String> wns = driver.getWindowHandles();
		
		List<String> wnl=new LinkedList<>();
		wnl.addAll(wns);
		driver.switchTo().window(wnl.get(3));
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//a[@id='wishListMainButton-announce']")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().window(wnl.get(2));
		driver.findElement(By.xpath("//a[@id='wishListMainButton-announce']")).click();
		
		
		
		
		
		
		
		
}
}
