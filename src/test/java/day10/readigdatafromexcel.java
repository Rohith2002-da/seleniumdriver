package day10;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class readigdatafromexcel {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

		FileInputStream file=new FileInputStream("C:\\Users\\User\\eclipse-workspace\\seleniumdriver\\testdata\\name.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet=workbook.getSheetAt(0);
		int totalrow=sheet.getLastRowNum();
		int totalcolumn=sheet.getRow(1).getLastCellNum();
		System.out.println(totalrow);
		System.out.println(totalcolumn);

		for(int r=0;r<=totalrow;r++)
		{
			XSSFRow currentrow=sheet.getRow(r);
			for(int c=0;c<totalcolumn;c++)
			{
				XSSFCell cell=currentrow.getCell(c);
				System.out.print(cell.toString()+"\t");
				
				
			}System.out.println();
		}
		workbook.close();
		file.close();
		
		
	}

}
