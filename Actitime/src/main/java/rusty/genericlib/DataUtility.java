package rusty.genericlib;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class DataUtility {

	public String getDataFromProperties (String key)throws IOException {
		// TODO Auto-generated method stub
		FileInputStream fis = new FileInputStream("C:\\Users\\arman\\eclipse-workspace\\SELENIUM\\testdata.properties");
		Properties pobj = new Properties();
		pobj.load(fis);
		String value = pobj.getProperty(key);
		return value;
		
		
	}
	public String getDataFromExcelSheet(String Sheetname,int rownum,int cellnum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis = new FileInputStream("C:\\Users\\arman\\OneDrive\\Documents\\data.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(Sheetname);
		DataFormatter format = new DataFormatter();
		String value = format.formatCellValue(sh.getRow(rownum).getCell(cellnum));
		return value;
		
	}

}
