//$Id$
package utilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.sl.usermodel.Sheet;
import org.apache.poi.ss.usermodel.DataFormat;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadXlSdata {
	
	public static <ReadXLSdata> void main(String[] args) throws Exception, Exception {
		ReadXlSdata red=new ReadXlSdata();
		red.getData("login");
		
	}
	
	public String[][] getData(String excelSheetName) throws Exception, IOException {
		File f=new File(System.getProperty("/home/jaya-14813/Downloads/learning/TestAutomationFrameWork/jaya automation.xlsx"));
		
		FileInputStream fli=new FileInputStream(f);
		Workbook wb=WorkbookFactory.create(fli);
		org.apache.poi.ss.usermodel.Sheet sheetname=wb.getSheet(excelSheetName);
		//XSSFWorkbook xsf =new XSSFWorkbook();
		int totalRows=sheetname.getLastRowNum();
		System.out.println(totalRows);
		Row rowcells=sheetname.getRow(0);
		int totalcols=rowcells.getLastCellNum();
		
		DataFormatter format=new DataFormatter();
		String testData[][]=new String[totalRows][totalcols];
		for(int i=1;i<=totalRows;i++) {
			for(int j=0;j<totalcols;j++) {
				testData[i-1][j]=format.formatCellValue(sheetname.getRow(i).getCell(j));
				
			}
		}
		return testData;
	}
}
