package dataDerivenWithDataProvider;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class dataDrivenFromExcelToDataProvider {
	
	@Test(dataProvider="dataTest")
	public void testCase(String gretting, String communication, String ID) {
		
	}
	
	DataFormatter formatter = new DataFormatter();
@DataProvider(name = "dataTest")
public Object[][] getData() throws IOException {
	
	FileInputStream file = new FileInputStream("C:\\Users\\Waffor\\Documents\\Exceldatadrivenproject-sheet -1.xlsx");
	XSSFWorkbook workBook = new XSSFWorkbook(file);
	XSSFSheet sheet = workBook.getSheetAt(0);
	int rowCount= sheet.getPhysicalNumberOfRows();
	XSSFRow row =sheet.getRow(0);
	int columnCount =	row.getLastCellNum();
	Object data[][] = new Object[rowCount-1][columnCount];
	for(int i=0; i<rowCount-1;i++) {
		sheet.getRow(i+1);
		for(int j=0; j<columnCount; j++) {
			XSSFCell cell =row.getCell(j);
			data[i][j] = formatter.formatCellValue(cell);
			
		}
	}

	
	
	 //	Object[][] data = {{array1}, {array2}, {array3}};
	 	return data;
}

}

