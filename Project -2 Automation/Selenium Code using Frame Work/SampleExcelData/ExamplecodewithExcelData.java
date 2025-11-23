package dataDriven;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class dataDriven {

	public static void main(String[] args)  {

		}
	public ArrayList<String> getData(String TestcaseName) throws IOException {
		
		//create Array List
		ArrayList<String> array = new ArrayList<String>();
		
		//pre-request or the step 1
//XSSFWorkbok accepts fileInputStream.
		FileInputStream file = new FileInputStream("C:\\Users\\Waffor\\Documents\\Exceldatadrivenproject-sheet -1.xlsx");
		XSSFWorkbook workBook = new XSSFWorkbook(file);
		int sheets = workBook.getNumberOfSheets();
		for(int i=0; i<sheets; i++) {
			if(workBook.getSheetName(i).equalsIgnoreCase("testdata")) {
			XSSFSheet sheetNumber = workBook.getSheetAt(i);
			//step 2 - identify the test case column by scanning the entire 1st row.
			Iterator<Row> rows = sheetNumber.iterator(); //sheet is collection of rows
			Row firstRow = rows.next();
			Iterator<Cell> cell=firstRow.cellIterator(); //rows is collection of cells
			int k=0;
			int column = 0;
			while(cell.hasNext()) {
				Cell value=cell.next();
				if(value.getStringCellValue().equalsIgnoreCase("Testcase")) {
					//step 3 - once the column is identified then scan the test case to identify login test case row
					column = k;
					
				}
				k++;
			}
			System.out.println(column);
			// step 3 - once identified and scan the entire test case column then  to identify login test case row
			while(rows.hasNext()) {
				Row R = rows.next();
				if(R.getCell(column).getStringCellValue().equalsIgnoreCase("Login")) {
					//after you grab the login row then pull all the data of the row and feed it into the test
					Iterator<Cell> CV =	R.cellIterator();
					while(CV.hasNext()) {
					Cell c =CV.next();	
					if(c.getCellType()==CellType.STRING) {
						array.add(c.getStringCellValue());
					}
					else{
						array.add(NumberToTextConverter.toText(c.getNumericCellValue()));
					}
					}
				}	
			}						
			}			
			}
		return array;
	}
	}


