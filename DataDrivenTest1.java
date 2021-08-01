package com.datadriven.test;


	import java.io.File;
	import java.io.FileInputStream;
//	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.List;

	import org.apache.poi.xssf.usermodel.XSSFCell;
	//import org.apache.poi.hssf.usermodel.HSSFCell;
	//import org.apache.poi.hssf.usermodel.HSSFRow;
	//import org.apache.poi.hssf.usermodel.HSSFSheet;
	//import org.apache.poi.hssf.usermodel.HSSFWorkbook;
	import org.apache.poi.xssf.usermodel.XSSFRow;
	import org.apache.poi.xssf.usermodel.XSSFSheet;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;


	public class DataDrivenTest1 {
			 
				public static void main(String[] args) throws InterruptedException, IOException {
					
					//String s=null;
					System.setProperty("webdriver.chrome.driver", "C:\\Seleniumdriver\\chromedriver.exe");
					WebDriver driver = new ChromeDriver();
					System.out.println("Loading URL one by one ........");
					driver.get("https://app.missionhumane.org");
					System.out.println("Current title is : " + driver.getTitle());
					
					Thread.sleep(2000);
					
					List<String> a = new ArrayList<>();
					List<WebElement> elements = driver.findElements(By.className("location-row"));
				    System.out.println("Number of elements:" +elements.size());
				    
				   // String path = "/Users/shivapriya/Desktop/ec.xlsx";
					
				    for (int i = 0; i < elements.size(); i++) {
				      a.add(elements.get(i).getText()); 
				         
				        System.out.println(elements.get(i).getText());
				    }
				    
				   // try
				    //{
				    
				    File file = new File("C:\\Seleniumdriver\\Data.xlsx");
					 FileInputStream inputStream = new FileInputStream(file);
					 
					XSSFWorkbook wb=new XSSFWorkbook(inputStream);
					// HSSFSheet sheet=wb.getSheet("Output");
					 XSSFSheet sheet=wb.getSheetAt(0);
				
					 
					 for(int i=0;i<elements.size();i++)
					 {
						 XSSFRow row1=sheet.createRow(i);
						 XSSFCell column=row1.createCell(0);
						 row1.createCell(0).setCellValue(elements.get(i).getText());
					
						 
						  }
					 FileOutputStream outputStream = new FileOutputStream("C:\\Seleniumdriver\\Data.xlsx");
				        wb.write(outputStream);
				        wb.close();
				
				   // }
				    
				  /*  catch(Exception e)
				    {
				    	System.out.println(e);
				    	
			        }*/
					driver.quit();	
					
		}
				    

	}









