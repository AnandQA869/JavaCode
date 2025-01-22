package excelSheet;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class YoutubWayExcel_Sheet {

	public static void main(String[] args) throws IOException {
File excelFile=new File("D:\\\\Documents Imp\\\\OWN DOCS\\\\data\\\\\\\\demodata.xlsx");
System.out.println(excelFile.exists());
FileInputStream fis = new FileInputStream(excelFile);
XSSFWorkbook workbook=new XSSFWorkbook(fis);
XSSFSheet sheet=workbook.getSheet("testdata");
//System.out.println(sheet.getPhysicalNumberOfRows());
int noofrows=sheet.getPhysicalNumberOfRows();
int noofcolumns=sheet.getRow(0).getLastCellNum();
System.out.println(sheet.getLastRowNum());
for(int i=1;i<noofrows;i++) ;
	for(int j=1;j<noofcolumns;j++){
		
	}
{
	
}


workbook.close();
fis.close();
	}

}
