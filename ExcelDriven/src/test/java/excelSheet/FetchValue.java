package excelSheet;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class FetchValue {

	
	public static void main(String[] args) throws EncryptedDocumentException, IOException 
	{
		//Step1 let the java know actual shet	
FileInputStream fil=new FileInputStream("D:\\Documents Imp\\OWN DOCS\\data\\\\demodata.xlsx");
//Step2 open excel sheet
Workbook w1=   WorkbookFactory.create(fil);
////Step3 Go to actual sheet
  Sheet s1=w1.getSheet("testdata");
 Row s2= s1.getRow(1);
 Cell s3=s2.getCell(0);
String un= s3.getStringCellValue();
 System.out.println(un);
 Row s4=s1.getRow(1);
         Cell s5=s4.getCell(1);
         String pw=    s5.getStringCellValue();
         System.out.println(pw);

 
	}

}
