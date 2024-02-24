package com.Utility;

import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {

	// to read the test data 
	
	public XSSFWorkbook wb;
	
	public ExcelDataProvider() throws Exception {
		String Excelpath=System.getProperty("user.dir")+"\\TestData\\FrameworkTestData.xlsx";
		FileInputStream file=new FileInputStream(Excelpath);
		wb=new XSSFWorkbook(file);
	}
	
	public String getStringTestDataFromExcel(String Sheetname,int row,int cell) {
		return wb.getSheet(Sheetname).getRow(row).getCell(cell).getStringCellValue();
	}
}
