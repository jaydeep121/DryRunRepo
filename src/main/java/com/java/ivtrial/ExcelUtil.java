package com.java.ivtrial;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtil {
	public static String filePath="E:\\Jaydeep\\All Files\\Book1.xlsx";
	public static File file=null;
	public static FileInputStream fis=null;
	public static void readExcel(int index) {
	
		try {
			fis=new FileInputStream(new File(filePath));
			XSSFWorkbook book=new XSSFWorkbook(fis);
			XSSFSheet sheet=book.getSheetAt(index);
			Iterator<Row> rowItr=sheet.iterator();
			while(rowItr.hasNext()) {
				Row row=rowItr.next();
				Iterator<Cell> cellItr=row.cellIterator();
				while(cellItr.hasNext()) {
					Cell cell=cellItr.next();
					 System.out.print(cell.getStringCellValue()+ " ");
				}
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			}	
		}
	public static void main(String arg[]) {
		readExcel(0);
	}

}
