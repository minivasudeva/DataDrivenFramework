package com.datadriven.test;



import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.Assert;

public class CompareExcel extends DataDrivenTest1 {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		try 
		{
			
			    InputStream file1InputStream = new FileInputStream("C:\\Seleniumdriver\\sheet1.xlsx");
				InputStream file2InputStream = new FileInputStream("C:\\Seleniumdriver\\Data.xlsx");
				XSSFWorkbook workbook1 = new XSSFWorkbook(file1InputStream);
				XSSFWorkbook workbook2 = new XSSFWorkbook(file2InputStream);

				
				int numberOfSheets = workbook1.getNumberOfSheets();
				for (int i = 0; i < numberOfSheets; i++)
					{
				int lastRowNum2 = workbook1.getSheetAt(i).getLastRowNum();
				for (int j = 0; j < lastRowNum2; j++)
					{
				short lastCellNum = workbook1.getSheetAt(i).getRow(j).getLastCellNum();
				
				for (int k = 0; k < lastCellNum; k++)
					{
				
				Assert.assertEquals(workbook1.getSheetAt(i).getRow(j).getCell(i).getStringCellValue(), workbook2.getSheetAt(i).getRow(j).getCell(i).getStringCellValue());
				}
				System.out.println("Input file:"+workbook1.getSheetAt(i).getRow(j).getCell(i).getStringCellValue() + " , " +"Output file:"+ workbook2.getSheetAt(i).getRow(j).getCell(i).getStringCellValue());
				}
				}
				}

				catch (IOException e)

				{
				System.out.println(e);
				}

	}
		
		
		
}

