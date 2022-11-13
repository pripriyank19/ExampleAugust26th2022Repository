package com.sgtesting.excelpoi;

import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Demo {


	public static void add()
	{
		System.out.println("addd");
	}
	public static void flowername()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("Sheet 1");
			r=sh.createRow(9);
			for(int i=0;i<20;i++)
			{
				c=r.createCell(i);
				c.setCellValue("flower"+(i+1));
			}
			fout=new FileOutputStream("C:\\Excel\\Assign22.xlsx");
			wb.write(fout);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void colournamesdiag()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			s=wb.createSheet("Sheet 1");
			for(int i=0;i<20;i++)
			{
				r=s.createRow(i);
				c=r.createCell(i);
				c.setCellValue("Colour"+(i+1));
			}
			fout=new FileOutputStream("C:\\Excel\\Assign3.xlsx");
			wb.write(fout);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void cityname()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			s=wb.createSheet("Sheet 1");
			for(int i=0;i<20;i++)
			{
				r=s.createRow(i);
				c=r.createCell(9);
				c.setCellValue("city"+(i+1));
			}
			fout=new FileOutputStream("C:\\Excel\\Assign4.xlsx");
			wb.write(fout);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}

	public static void colourflower()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s=null;
		Row r=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			s=wb.createSheet("Sheet 1");
			for(int i=0;i<20;i++)
			{
				r=s.createRow(i);
				c=r.createCell(0);
				c.setCellValue("Flower"+(i+1));
				c=r.createCell(1);
				c.setCellValue("Colour"+(i+1));
			}
			fout=new FileOutputStream("C:\\Excel\\Assign5.xlsx");
			wb.write(fout);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void capitalcountry()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet s=null;
		Row r1=null;
		Row r2=null;
		Cell c=null;
		try
		{
			wb=new XSSFWorkbook();
			s=wb.createSheet("Sheet 1");
			r1=s.createRow(3);
			r2=s.createRow(4);
			for(int i=0;i<20;i++)
			{
				c=r1.createCell(i);
				c.setCellValue("Capital"+(i+1));
				c=r2.createCell(i);
				c.setCellValue("Country"+(i+1));
			}
			fout=new FileOutputStream("C:\\Excel\\Assign6.xlsx");
			wb.write(fout);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}
			catch(Exception e)
			{
				e.printStackTrace();
			}
		}
	}
	public static void writeContent()
	{
		FileOutputStream fout=null;
		Workbook wb=null;
		Sheet sh=null;
		Row row=null;
		Cell cell=null;
		try
		{
			wb=new XSSFWorkbook();
			sh=wb.createSheet("FlowerNames");
			//First Row
			row=sh.createRow(0);
			cell=row.createCell(0);
			cell.setCellValue("Flower1");
			//Second Row
			row=sh.createRow(1);
			cell=row.createCell(0);
			cell.setCellValue("Flower2");
			//Third Row
			row=sh.createRow(2);
			cell=row.createCell(0);
			cell.setCellValue("Flower3");
			//Fourth Row
			row=sh.createRow(3);
			cell=row.createCell(0);
			cell.setCellValue("Flower4");
			//fifth Row
			row=sh.createRow(4);
			cell=row.createCell(0);
			cell.setCellValue("Flower5");
			//sixth Row
			row=sh.createRow(5);
			cell=row.createCell(0);
			cell.setCellValue("Flower6");
			//seventh Row
			row=sh.createRow(6);
			cell=row.createCell(0);
			cell.setCellValue("Flower7");
			//Eighth Row
			row=sh.createRow(7);
			cell=row.createCell(0);
			cell.setCellValue("Flower8");
			//ninth Row
			row=sh.createRow(8);
			cell=row.createCell(0);
			cell.setCellValue("Flower9");
			//tenth Row
			row=sh.createRow(9);
			cell=row.createCell(0);
			cell.setCellValue("Flower10");
			//eleventh Row
			row=sh.createRow(10);
			cell=row.createCell(0);
			cell.setCellValue("Flower11");
			//twelve Row
			row=sh.createRow(11);
			cell=row.createCell(0);
			cell.setCellValue("Flower12");
			//thirteenth Row
			row=sh.createRow(12);
			cell=row.createCell(0);
			cell.setCellValue("Flower13");
			//fourteenth Row
			row=sh.createRow(13);
			cell=row.createCell(0);
			cell.setCellValue("Flower14");
			//fifteenth Row
			row=sh.createRow(14);
			cell=row.createCell(0);
			cell.setCellValue("Flower15");
			//sixteenth Row
			row=sh.createRow(15);
			cell=row.createCell(0);
			cell.setCellValue("Flower16");
			//seventeenthRow
			row=sh.createRow(16);
			cell=row.createCell(0);
			cell.setCellValue("Flower17");
			//Eighteenth Row
			row=sh.createRow(17);
			cell=row.createCell(0);
			cell.setCellValue("Flower18");
			//Nineteenth Row
			row=sh.createRow(18);
			cell=row.createCell(0);
			cell.setCellValue("Flower19");
			//Twentieth Row
			row=sh.createRow(19);
			cell=row.createCell(0);
			cell.setCellValue("Flower20");
			fout=new FileOutputStream("C:\\Excel\\Assign1.xlsx");
			wb.write(fout);
		}catch (Exception e) 
		{
			e.printStackTrace();
		}
		finally
		{
			try
			{
				fout.close();
				wb.close();
			}catch (Exception e) 
			{
				e.printStackTrace();
			}
		}
	}

public static void Student()
{
	FileInputStream fin=null;
	FileOutputStream fout=null;
	Workbook wb=null;
	Sheet s1=null;
	Sheet s2=null;
	Row r1=null;
	Row r2=null;
	Cell c1=null;
	Cell c2=null;
	try
	{
		fin=new FileInputStream("C:\\Excel\\Assign9.xlsx");
		wb=new XSSFWorkbook(fin);
		s1=wb.getSheet("Sheet1");
		s2=wb.createSheet("Sheet2");
		int a=s1.getPhysicalNumberOfRows();
		for(int i=0;i<a;i++)
		{
			r1=s1.getRow(i);
			r2=s2.createRow(i);
			int b=r1.getPhysicalNumberOfCells();
			for(int j=0;j<b;j++)
			{
				c1=r1.getCell(j);
				c2=r2.createCell(j);
				String c=c1.getStringCellValue();
				c2.setCellValue(c);
			}

		}
		fout=new FileOutputStream("C:\\Excel\\Assign9.xlsx");
		wb.write(fout);
	}
	catch(Exception e)
	{
		e.printStackTrace();
	}
	finally
	{
		try
		{
			fout.close();
			fin.close();
			wb.close();
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
}


