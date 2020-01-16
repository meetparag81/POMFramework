package com.POMfamework.helper.excel;



import java.io.File;
import java.util.Iterator;

import javax.imageio.stream.FileImageInputStream;

import org.apache.log4j.Logger;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFCreationHelper;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFHyperlink;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import com.POMfamework.helper.logger.LoggerHelper;
import com.POMfamework.helper.resource.ResourceHelper;

public class ExcelHelper 
{
	private static  Logger log = LoggerHelper.GetLogger(ExcelHelper.class);
	
	

	
	public Object[][] getExcelData(String Excellocation,String sheetname)
	{
		try
		{
			Object datasets[][]= null;
			File Fileloc = new File(Excellocation);
					
			FileImageInputStream File = new FileImageInputStream(Fileloc);
			//create workbook instance
			System.out.println();
			XSSFWorkbook workbook = new XSSFWorkbook();
			//GetSheetNamefromworkbook
		XSSFSheet sheet = workbook.getSheet(sheetname);
		//countActverows in sheets
		int totalrows= sheet.getLastRowNum();
		//countActive columns in row
		int totalcolmns = sheet.getRow(0).getLastCellNum();
		datasets= new Object[totalrows][totalcolmns];
		
		//itrate through each row
		Iterator<Row> rowiterator = sheet.iterator();
		rowiterator= sheet.iterator();
		int i=0;
		while(rowiterator.hasNext())
		{
			i++;
			//for every row need to iterate over column
			Row row = rowiterator.next();
			int j=0;
			Iterator<Cell> cellierator = row.cellIterator();
			while(cellierator.hasNext())
			{
				j++;
				Cell cell = cellierator.next();
				switch(cell.getCellType())
					{
					case STRING	:				
						datasets[i][j]= cell.getStringCellValue();
						break;
					case NUMERIC:
						datasets[i][j]= cell.getNumericCellValue();
						break;
					case BOOLEAN:
					datasets[i][j]= cell.getBooleanCellValue();
					break;
				case FORMULA:
					datasets[i][j]= cell.getCellFormula();
					break;
				default:
					System.out.println("No Matching Enum type found");
					break;
					
						
					
					}
				
				}
			}
		return datasets;
			
		
		
		}
		catch(Exception e)
		{
			e.printStackTrace();
			return null;
		}
	}
	
	public static void main(String[] args) 
	{
		ExcelHelper excel = new ExcelHelper();
		String Excellocation = ResourceHelper.GetResourcePath("\\src\\main\\java\\com\\POMfamework\\helper\\excelData\\Data.xlsx");
		Object[][] data = excel.getExcelData(Excellocation, "Login");
	}
}
