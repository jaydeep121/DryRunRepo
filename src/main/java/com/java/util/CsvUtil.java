package com.java.util;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;

public class CsvUtil {
	
	public static String path="./data/test.csv";
	
	public static void main(String[] args) {
		//sampleCsvRead(path);
		OpenCSVReader(path);
		}
	//OpenCSV : third party CSV library
	public static void OpenCSVReader(String filePath) {
		CSVReader reader = null;
        try {
            reader = new CSVReader(new FileReader(filePath));
            String[] line;
            while ((line = reader.readNext()) != null) {
                System.out.println("Country [id= " + line[0] + ", code= " + line[1] + " , name=" + line[2] + "]");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
      }
	public static void advanceCsvReading(String filePath) {
		//reference :visit to- "https://mkyong.com/java/how-to-read-and-parse-csv-file-in-java/"
	}
	public static void sampleCsvRead(String filePath) {
	        BufferedReader br = null;
	        String line = "";
	        String cvsSplitBy = ",";
	        try {
	            br = new BufferedReader(new FileReader(filePath));
	            while ((line = br.readLine()) != null) {
	            	// use comma as separator
	                String[] country = line.split(cvsSplitBy);
	                System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        } finally {
	            if (br != null) {
	                try {
	                    br.close();
	                } catch (IOException e) {
	                    e.printStackTrace();
	                }
	            }
	        }
	 }
}
