package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class EasyWayExcelSheet {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
FileInputStream file= new FileInputStream("D:\\\\Documents Imp\\\\OWN DOCS\\\\data\\\\\\\\demodata.xlsx");

Workbook w1=WorkbookFactory.create(file);
String un= w1.getSheet("testdata").getRow(2).getCell(2).getStringCellValue();
String pw= w1.getSheet("testdata").getRow(1).getCell(3).getStringCellValue();
System.out.println(un);
System.out.println(pw);






	}
	
	
}
