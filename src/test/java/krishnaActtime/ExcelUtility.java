package krishnaActtime;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ExcelUtility {

	public String readdatafromExcel(String sheetName,int rowNum,int cellNum) throws EncryptedDocumentException, IOException
	{
		FileInputStream fis=new FileInputStream(".\\src\\test\\resources\\TestData.xlsx");
		Workbook book = WorkbookFactory.create(fis);
		Sheet sh = book.getSheet(sheetName);
		String value = sh.getRow(rowNum).getCell(cellNum).getStringCellValue();
		return value;
	}

}
