package com.sgtesting.excelpoi;


import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class Assignment2 {

	public static void main(String[] args) {
		ColourNames();

	}
    private static void ColourNames()
    {
    	FileOutputStream fout=null;
    	Workbook wb=null;
    	Sheet sh=null;
    	Row row=null;
    	Cell cell=null;
    	try
    	{
    		wb=new XSSFWorkbook();
    		sh=wb.createSheet("colournames");
    		row=sh.createRow(9);
    		cell=row.createCell(0);
    		cell.setCellValue("colour1");
    		cell=row.createCell(1);
    		cell.setCellValue("colour2");
    		cell=row.createCell(2);
    		cell.setCellValue("colour3");
    		cell=row.createCell(3);
    		cell.setCellValue("colour4");
    		cell=row.createCell(4);
    		cell.setCellValue("colour5");
    		cell=row.createCell(5);
    		cell.setCellValue("colour6");
    		cell=row.createCell(6);
    		cell.setCellValue("colour7");
    		cell=row.createCell(7);
    		cell.setCellValue("colour8");
    		cell=row.createCell(8);
    		cell.setCellValue("colour9");
    		cell=row.createCell(9);
    		cell.setCellValue("colour10");
    		cell=row.createCell(10);
    		cell.setCellValue("colour11");
    		cell=row.createCell(11);
    		cell.setCellValue("colour12");
    		cell=row.createCell(12);
    		cell.setCellValue("colour13");
    		cell=row.createCell(13);
    		cell.setCellValue("colour14");
    		cell=row.createCell(14);
    		cell.setCellValue("colour15");
    		cell=row.createCell(15);
    		cell.setCellValue("colour16");
    		cell=row.createCell(16);
    		cell.setCellValue("colour17");
    		cell=row.createCell(17);
    		cell.setCellValue("colour18");
    		cell=row.createCell(18);
    		cell.setCellValue("colour19");
    		cell=row.createCell(19);
    		cell.setCellValue("colour20");
    		fout=new FileOutputStream("C:\\Excel\\Assignment2.xlsx");
    		wb.write(fout);
    		
    	}catch(Exception e)
    	{
    		e.printStackTrace();
    	}
    	finally
    	{
    		try
    		{
    			fout.close();
    			wb.close();
    			
    		}catch(Exception e)
    		{
    			e.printStackTrace();
    		}
    	}
    }
}

