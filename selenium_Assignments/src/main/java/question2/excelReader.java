package question2;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelReader {

	static XSSFWorkbook wb;
	static XSSFSheet sheet;
	public static void main(String[] args) throws IOException {
		
		String filepath = "C:\\Users\\User\\eclipse-workspace\\selenium_Assignments\\src\\main\\java\\question2\\TestData.xlsx";
		try {
			wb = new XSSFWorkbook(filepath);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	sheet = wb.getSheet("data");
	int rowsCount = sheet.getPhysicalNumberOfRows();
	int colCount = sheet.getRow(0).getLastCellNum();
	Object[][] data = new Object[rowsCount][colCount]; 
		for(int row = 0 ; row < rowsCount ; row ++ ) {
			for(int col = 0 ; col <colCount ; col++) {
				data[row][col]=sheet.getRow(row).getCell(col);
			}
		}
		
	for(int i = 0 ; i < data.length ; i++) {
		for(int j = 0 ; j< data[0].length ; j++) {
			System.out.println(data[i][j]);
		}
	}
	}
}
