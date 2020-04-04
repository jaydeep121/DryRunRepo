package com.java.util;

import java.io.IOException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	
	/*in XSSFWork book we do not need to provide inputfilestream in XSSFWork
	constructor*/
	public ExcelUtil(String excelPath,String sheetName) {
		try {
			book=new XSSFWorkbook(excelPath);
			sheet=book.getSheet(sheetName);
		} catch (IOException e) {
			System.out.println(e.getCause());
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
	}
	public static int getRowCount() {
		int rowCount=sheet.getPhysicalNumberOfRows();
		return rowCount;
	}
	public static void getCellData(int rowNum,int cellNum) {
		DataFormatter format=new DataFormatter();
		Object value=format.formatCellValue(sheet.getRow(rowNum).getCell(cellNum));
		System.out.println(value);	
	}
}
