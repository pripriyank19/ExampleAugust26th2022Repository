package com.sgtesting.reflection5;

import java.io.FileInputStream;

import java.lang.reflect.Method;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExecuteMethods {

	public static void main(String[] args) {
		executeMethods();
	}
	
	private static void executeMethods()
	{
		FileInputStream fin=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		
		Cell cell=null;
		try
		{
			fin=new FileInputStream("C:\\GitRepository\\CurrentWorkSpace\\ExampleAugust26th2022Repository\\Reflection-Automation1\\DataFile\\Workbook1.xlsx");
			wb=new XSSFWorkbook(fin);
			sh=wb.getSheet("Sheet1");
			int rc=sh.getPhysicalNumberOfRows();
			for(int r=1;r<rc;r++)
			{
				row=sh.getRow(r);
				cell=row.getCell(0);
				String methodname=cell.getStringCellValue();
				
				cell=row.getCell(1);
				String pkgcls=cell.getStringCellValue();
				System.out.println(methodname+"  "+pkgcls);
				Class clsObj=Class.forName(pkgcls);
				Object obj=clsObj.getConstructor().newInstance();
				
				Method method=obj.getClass().getMethod(methodname);
				method.invoke(obj);
			}
			
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}

