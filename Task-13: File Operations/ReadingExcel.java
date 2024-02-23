package apachepoi;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadingExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {

			String filePath = "F:\\Guvi\\File_Operations\\Students_Info.xlsx";
			FileInputStream fis = new FileInputStream(filePath);
			//Create the object of XSSFWorkbook Class and pass the object of Inputstream
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			//Create the Sheet inside the workbook with name "Sheet1"
			XSSFSheet sheet = wb.getSheet("Sheet1");

			//Find the Number of Rows and Columns are present in the Student_Info2 Excel sheet
			int no_of_rows = sheet.getLastRowNum();
			int no_of_columns = sheet.getRow(1).getLastCellNum();

			// Read and Print data to the console from the Excel sheet
			for (int r = 0; r <= no_of_rows; r++) {

				//Get the row inside the sheet using the row number
				XSSFRow row = sheet.getRow(r);
				for (int c = 0; c < no_of_columns; c++) {

					//Get the cell on the particular row using the column number
					XSSFCell cell = row.getCell(c);

					//Check the Type of the cell is same as String type 
					if (cell.getCellType() == CellType.STRING) {
						System.out.print(cell.getStringCellValue());//Print the String value 
					} else {
						System.out.print(cell.getNumericCellValue());//Print the Integer value
					}
					System.out.print("   |    ");
				}
				System.out.println();
			}

		} catch (Exception e) {
			System.out.println("Exception is Occured");
		}
	}

}
