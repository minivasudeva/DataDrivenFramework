package com.datadriven.test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExtractOxygenData {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C://Seleniumdriver//chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//System.out.println("Loading URL one by one ........");
		driver.get("https://app.missionhumane.org");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		Thread.sleep(2000);
	   WebElement state =  driver.findElement(By.className("location-row"));
	   state.click();
	   Thread.sleep(2000);
	   //WebElement district = driver.findElement(By.xpath("//div[text()='Anantapur']"));
	   //district.click();
	   
	   
	   WebElement district = driver.findElement(By.xpath("//div[text()='View Information from all Districts']"));
	   
	   district.click();
        Thread.sleep(2000);

        WebElement oxygen = driver.findElement(By.xpath("//img[@src='/images/oxygen.svg']"));
        
        oxygen.click();
        
        //System.out.println("no of data " +oxygen.getText());
        Thread.sleep(3000);
       
        
        
        
        
        
        
        
        driver.close();
	
	}
	
	
	
	
	
	
	
}



