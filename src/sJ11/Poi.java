package sJ11;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Poi {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		File xlfile = new File("C:\\Users\\PSQA\\Desktop\\Excel\\testsj.xlsx");
		
		FileInputStream xlFIS = new FileInputStream(xlfile);

		//xls and xlsx are two different file types
		//xls = HSSF
		//xlsx = XSSF
		
		XSSFWorkbook xlbook = new XSSFWorkbook(xlFIS);
		
		XSSFSheet xlsheet = xlbook.getSheet("Sheet1");
		//read and write multiple data sets
		//created object for rows and cell
		XSSFRow objrow;
		XSSFCell objcolumn;
		//finds the last row number
		System.out.println(xlsheet.getLastRowNum());
		//creating a loop intializing a variable to the set number of rows in your data 
		//and basically go through them starting from 0 up 
		for ( int j =1; j <=xlsheet.getLastRowNum(); j++)
		{
			objrow = xlsheet.getRow(j);
			objcolumn = objrow.getCell(0);
			System.out.println(objcolumn.getStringCellValue());
			objcolumn = objrow.getCell(1);
			System.out.println(objcolumn.getStringCellValue());
		
			objcolumn = objrow.createCell(2);
			objcolumn.setCellValue("Pass");
		}
		//XSSFRow xlrow = xlsheet.getRow(1);
		
		//XSSFCell xlcolumn = xlrow.getCell(0);
		
		//System.out.println(xlcolumn.getStringCellValue());
		
		//xlcolumn = xlrow.getCell(1);
		//System.out.println(xlcolumn.getStringCellValue());

		
		
		FileOutputStream xlFOS = new FileOutputStream(xlfile);
		//int x = 0;
		 //for (x=0; x<20; x++);
		//{
			
		
		//xlrow.createCell(x).setCellValue("PASSED");
		xlbook.write(xlFOS);
		xlFIS.close();
		xlFOS.close();
		}
		
	}


