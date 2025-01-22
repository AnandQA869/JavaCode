import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException 
	
	{
		//FileInput stream
		FileInputStream fi = new FileInputStream("C:\\Users\\Anand Pramamik\\Documents\\demodata.xlsx");
XSSFWorkbook workbook=new XSSFWorkbook(fi);
int sheets =workbook.getNumberOfSheets();
for(int i=0;i<sheets;i++)
{
	if(workbook.getSheetName(i).equalsIgnoreCase("testdata")) {
		
	}
	XSSFSheet sheet=workbook.getSheetAt(i);
	//sheet.ite
}
	}

}
