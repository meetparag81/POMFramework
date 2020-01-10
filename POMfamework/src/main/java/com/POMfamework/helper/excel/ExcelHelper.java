package com.POMfamework.helper.excel;



import java.io.File;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.log4j.Logger;
import org.apache.poi.hssf.usermodel.HSSFCellStyle;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.hssf.util.HSSFColor;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.POMfamework.helper.logger.LoggerHelper;

public class ExcelHelper 
{
	private static  Logger log = LoggerHelper.GetLogger(ExcelHelper.class);
	
	

	
	public void getExcelData(String Excellocation,String sheetname)
	{
		try
		{
			String datasets[][]= null;
			File Fileloc = new File(Excellocation);
					
			FileImageInputStream File = new FileImageInputStream(Fileloc);
			//create workbook instance
			XSSFWorkbook workbook = new XSSFWorkbook();
			//GetSheetNamefromworkbook
		XSSFSheet sheet = workbook.getSheet(sheetname);
		//countActverows in sheets
		int totalrows= sheet.getLastRowNum();
		//countActive columns in row
		int totalcolmns = sheet.getRow(0).getLastCellNum();
		datasets= new String[totalrows][totalcolmns];
		
		//itrate through each row
		Iterator<Row> rowiterator = sheet.iterator();
		int i=0;
		while(rowiterator.hasNext())
		{
			//for every row need to iterate over column
			Row row = rowiterator.next();
			Iterator<Cell> cellierator = row.cellIterator();
			while(cellierator.hasNext())
			{
				Cell cell = cellierator.next();
			}
			
			
		}
		
		}
		catch(Exception e)
		{
			
		}
	}
}
