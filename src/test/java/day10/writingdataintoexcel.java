package day10;

import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class writingdataintoexcel {
public static void main(String[] args) throws IOException {
	
	
	XSSFWorkbook workbook=new XSSFWorkbook();
	
	XSSFSheet sheet=workbook.createSheet("Data");

	XSSFRow row1=sheet.createRow(0);
	row1.createCell(0).setCellValue("java");
	row1.createCell(1).setCellValue("123");
	row1.createCell(2).setCellValue("automation");
	
	XSSFRow row2=sheet.createRow(1);
	row2.createCell(0).setCellValue("python");
	row2.createCell(1).setCellValue("234");		    	
	row2.createCell(2).setCellValue("automation");
	
	XSSFRow row3=sheet.createRow(2);
	row3.createCell(0).setCellValue("c");
	row3.createCell(1).setCellValue("345");
	row3.createCell(2).setCellValue("automation");
	
	FileOutputStream file=new FileOutputStream("C:\\Users\\User\\eclipse-workspace\\seleniumdriver\\testdata\\write1.xlsx");
	workbook.write(file);
	workbook.close();
	file.close();
	
	System.out.print("file created");
}
}