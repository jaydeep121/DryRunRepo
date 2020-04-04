package com.java.util;

public class Test {
	public static void main(String[] args) {
		String filePath="./data/ExcelData.xlsx";
		ExcelUtil util=new ExcelUtil(filePath, "Sheet1");
		int rowCount=util.getRowCount();
		System.out.println(rowCount);
		util.getCellData(1, 2);
	}

}
