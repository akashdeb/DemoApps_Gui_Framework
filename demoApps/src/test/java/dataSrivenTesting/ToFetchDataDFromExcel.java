package dataSrivenTesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ToFetchDataDFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_Feb_Weekend_2pm\\demoApps\\src\\test\\resources\\ExcelData2.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.getRow(1);
		
		Cell cell = row.getCell(1);
		
		String email = cell.getStringCellValue();
		
		System.out.println(email);
		
		long phoneNo = (long)row.getCell(3).getNumericCellValue();
		
		System.out.println(phoneNo);

	}

}
