package excelReadandWrite;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadfile {

	public static void main(String[] args) throws Exception {

		File file = new File("C:\\Seleniumdriver\\Data.xlsx");
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook wb = new XSSFWorkbook(fis);
		XSSFSheet sheet1 = wb.getSheetAt(0);//providing sheet name
		String statename = sheet1.getRow(0).getCell(0).getStringCellValue();
		System.out.println(statename);
        int rowcount = sheet1.getLastRowNum();// return the row count
        System.out.println(rowcount);
        
        int columcount = sheet1.getRow(0).getLastCellNum();//return the columncount
       System.out.println(columcount);
        for(int i =0;i<=rowcount;i++)
        {
            XSSFRow currentrow = sheet1.getRow(i);//focused on current row
       
        	for(int j =0;j<columcount;j++)
       	{
     		String value = currentrow.getCell(j).toString();
       		System.out.println(value);
        		
        	}
        }
        
        
	}

	}


