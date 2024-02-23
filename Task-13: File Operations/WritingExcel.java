package apachepoi;

import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	try {
		XSSFWorkbook workbook = new XSSFWorkbook();//Create the object of XSSFWorkbook Class
		//Create the Sheet inside the workbook with name "Sheet1"
		XSSFSheet sheet = workbook.createSheet("Sheet1");
		
		// Write data to the Excel sheet
		Object[][] studentsdata = {
				{"Name","Age","Email"},
				{"John Doe","30","john@test.com"},
				{"Jane Doe","28","jane@test.com"},
				{"Bob Smith","35","jacky@example.com"},
				{"Swapnil","37","swapnil@example.com"},
		};
		//Find the Number of Rows and Columns are present in the studentsdata  array
		int no_of_rows = studentsdata.length;
		int no_of_columns = studentsdata[0].length;
		
		for(int r=0;r<no_of_rows;r++) {
			
			//Create the row inside the sheet using the row number
			XSSFRow row = sheet.createRow(r);
			
			for(int c=0;c<no_of_columns;c++) {
				
				//Create the cell on the particular row using the column number
				XSSFCell cell = row.createCell(c);
				Object value = studentsdata[r][c];
				
				if(value instanceof String) //Check the value is of the String type or not 
					 
					cell.setCellValue((String)value);//value is in object type we need to convert into String type
				else
					 
					cell.setCellValue((Integer)value);//value is in object type we need to convert into Integer type
				 
			}
		}
		
		// Write the workbook to a file
		String filePath = "F:\\Guvi\\File_Operations\\Students_Info2.xlsx";
		FileOutputStream fos = new FileOutputStream(filePath);
		workbook.write(fos);
		
		fos.close();//Close the FileOutputStream to avoid resource leakage
		System.out.println("Excel file created successfully at path: ");
		
	}catch(Exception e) {
		System.out.println("Exception is occured"+ e);
	}

}
}
