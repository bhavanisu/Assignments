package week4.day4;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcel {
public String[][] Runexcel() throws IOException {
		XSSFWorkbook Workbook = new XSSFWorkbook("./data/CreateLead.xlsx");
		
		XSSFSheet sheet = Workbook.getSheet("Sheet1");
		
		int rowNum = sheet.getLastRowNum();
		System.out.println("without header rows:" +rowNum);
		 
		int physicalNumberOfRows = sheet.getPhysicalNumberOfRows();
		System.out.println("all rows:" +physicalNumberOfRows);
		
		int columncount = sheet.getRow(0).getLastCellNum();
		System.out.println("column count:" +columncount);
		String[][] data = new String [rowNum][columncount];
		for (int i = 1; i < physicalNumberOfRows; i++) {
		for (int j = 0; j < columncount; j++)
		{
			String stringCellValue = sheet.getRow(i).getCell(j).getStringCellValue();
			System.out.println(stringCellValue);
			data[i-1][j]=stringCellValue;
			
		}
			
		}
		
		Workbook.close();
		return data;
	}

}
