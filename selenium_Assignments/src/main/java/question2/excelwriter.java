package question2;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class excelwriter {

	public static void main(String[] args) throws IOException {
		
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("Emp Info");
		Object empdata[][]= {{"EmpID","EmpName","Designation"},
								{101,"David","manager"},
								{202,"John","Asst.Manager"},
								{303,"Akhil","Senior Manager"}};
		
			int rows = empdata.length;
			int cols = empdata[0].length;
			
			for(int r = 0 ;r < rows ; r++) {
				XSSFRow row = sheet.createRow(r);
				for(int c=0; c<cols; c++) {
					 XSSFCell cell = row.createCell(c);
					 Object value = empdata[r][c];
					 
					 if(value instanceof String) {
						 cell.setCellValue((String) value);
					 }
					 if(value instanceof Integer) {
						 cell.setCellValue((Integer) value);
					 }
					 if(value instanceof Boolean) {
						 cell.setCellValue((Boolean) value);
					 }
				}
			}
			
			String filepath = "C:\\Users\\User\\eclipse-workspace\\selenium_Assignments\\src\\main\\java\\question2\\created.xlsx";
			FileOutputStream outStream = new FileOutputStream(filepath);
			workbook.write(outStream);
			outStream.close();
			System.out.println("Writing data into excel successfull");
		}
}
