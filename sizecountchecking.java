package com.datadriven.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.interactions.*;

import org.openqa.selenium.JavascriptExecutor;
//public class ResourceDetailsExtraction 

public class sizecountchecking {
public static void main(String[] args) throws InterruptedException {
  
  System.setProperty("webdriver.chrome.driver", "C://Seleniumdriver//chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  //System.out.println("Loading URL one by one ........");
  driver.get("https://app.missionhumane.org");
  Thread.sleep(5000);
  driver.manage().window().maximize();
  Thread.sleep(5000);
  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[11]/div")).click();
  Thread.sleep(2000);
  driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[3]/div")).click();
  Thread.sleep(2000);
  //driver.findElement(By.xpath("//*[@id=\"root\"]/div/div/div[3]/div[3]/div[1]")).click();
  //Thread.sleep(2000);
//System.out.println("Bed Information");
  
  ///Writing code for clicking the data 
List <WebElement> elements = driver.findElements(By.className("sc-hKFxyN kksiKu"));
System.out.println(elements.size());
String data1 = "//*[@id='root']/div/div/div[3]/div[";

String data2 = "]/div[1]";

 for (int c = 1; c <= 11; c++) {
 
    
         Thread.sleep(2000);
         String data3 = data1.concat(String.valueOf(c)).concat(data2);
   System.out.println("The information of :"+driver.findElement(By.xpath(data3)).getText());
  // System.out.println(id3);
   driver.findElement(By.xpath(data3)).click();
   Thread.sleep(8000);
   
   String id1 = "//*[@id='root']/div/div/div[";
   String id2 = "]/div";
  
   
   // oxygen data 
    for (int m = 4; m < 7; m++) {
     String id3 = id1.concat(String.valueOf(m)).concat(id2);
     //System.out.println(id3);
     WebElement description = driver.findElement(By.xpath(id3));
    
     System.out.println("The descriptioon is : " +  description.getText());
     
    // driver.findElement(By.xpath(id3)).click();
     Thread.sleep(8000);
    }
     //driver.findElement(arg0)
    driver.findElement(By.xpath("//*[@id=\'root\']/div/div/div[2]/div/div/span[1]/img")).click();
    Thread.sleep(2000);
 }
 driver.close();
}
}