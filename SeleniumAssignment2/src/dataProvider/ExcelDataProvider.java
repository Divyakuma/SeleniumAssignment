package dataProvider;

import java.io.File;
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelDataProvider {
	
	XSSFWorkbook wb;
	
	public ExcelDataProvider()
	{
		File src=new File("./Applicationdata/loginData.xlsx");
		try {
			FileInputStream fis=new FileInputStream(src);
			wb=new XSSFWorkbook(fis);
			
		} catch (Exception e) {
			System.out.println("Exception is: "+e.getMessage());
		}
		
	}
	
	public String getdata(int sheetindex,int row,int col)
	{
		return wb.getSheetAt(sheetindex).getRow(row).getCell(col).getStringCellValue();
	}
	
	public int getintdata(int sheetindex,int row,int col)
	{
		 int data = (int)wb.getSheetAt(sheetindex).getRow(row).getCell(col).getNumericCellValue();
		return data;
	}

}
