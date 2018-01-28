package com.util;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

import org.apache.commons.io.FilenameUtils;

public class TestData {

	public static String[][] readExcel(String datapath, String filename)
			throws IOException {

		File folder = new File(datapath);
		File[] listOfFiles = folder.listFiles();
		for (int i = 0; i < listOfFiles.length; i++) {
		      if (listOfFiles[i].isFile()) {
		    	  System.out.println("File Name: " + listOfFiles[i].getName() 
		    			  + " and File Extension:" + FilenameUtils.getExtension (listOfFiles[i].getName())
		    			  + " and File Size: " + listOfFiles[i].length()
		    			  		+ " and File MIME type:  " + Files.probeContentType( listOfFiles[i].toPath()));
		          
		          if (listOfFiles[i].getName().equals(filename)){
		        	  System.out.println("File " + filename + " found"); 
		          }
		       }  
		}
		try 
        {
			File inputWorkbook = new File(datapath+filename);
	        Workbook w;
            w = Workbook.getWorkbook(inputWorkbook);
            Sheet sheet = w.getSheet(0);
            String[][] data = new String[sheet.getRows()][sheet.getColumns()];
          
            for (int i = 0; i <sheet.getRows(); i++) 
            {
                for (int j = 0; j < sheet.getColumns(); j++) 
                {
                    Cell cell = sheet.getCell(j, i);
                    data[i][j] = cell.getContents();
                
                }
            }
            return data;
        } 
        catch (BiffException e) 
        {
            e.printStackTrace();
        }
		return null;
   
    }

	
	
	public static void main (String[] args ) throws IOException{
		String[][] data = readExcel ("C://DVLA//", "testdata.xls");
		
		System.out.println(data[0][1]);
		System.out.println(data[0][2]);
		System.out.println(data[0][3]);
			
		}
		
	}

