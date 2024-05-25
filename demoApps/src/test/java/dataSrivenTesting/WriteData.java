package dataSrivenTesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_Feb_Weekend_2pm\\demoApps\\src\\test\\resources\\ExcelData2.xlsx");
		
		Workbook workbook = WorkbookFactory.create(fis);
		Sheet sheet = workbook.getSheet("Sheet1");
		
		Row row = sheet.createRow(2);
		
		Cell cell = row.createCell(0);
		
		cell.setCellValue("Priyanka");
		
		FileOutputStream fos = new FileOutputStream("C:\\Users\\User\\Desktop\\Scripts\\eclipse-workspace_Feb_Weekend_2pm\\demoApps\\src\\test\\resources\\ExcelData2.xlsx");
		workbook.write(fos);
		
	}

}
