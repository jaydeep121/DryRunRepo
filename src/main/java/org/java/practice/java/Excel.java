package org.java.practice.java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	
	public static String file="E:\\Jaydeep\\Book1.xlsx";
	public static FileInputStream fin;
	public static XSSFWorkbook book;
	public static XSSFSheet sheet;
	

	
	public static void readExcel(int index) throws IOException {
		fin=new FileInputStream(new File(file));
			book=new XSSFWorkbook(fin);
			sheet=book.getSheetAt(index);
			Iterator<Row> rowItr=sheet.iterator();
			while(rowItr.hasNext()) {
				Row row=rowItr.next();
				Iterator<Cell> cellItr=row.cellIterator();
				while(cellItr.hasNext()) {
					Cell cell=cellItr.next();
					 System.out.print(cell.getStringCellValue()+ " ");
				}
				System.out.println();
			}	
	}
	public static void main(String arg[]) throws IOException {
		readExcel(1);
	}
	

}
