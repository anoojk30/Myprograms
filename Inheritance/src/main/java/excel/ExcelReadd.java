package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReadd {
	
	static FileInputStream f;
	static XSSFWorkbook w;
	static XSSFSheet s;
	public static String getStringData(int a,int b) throws IOException
	{
		f=new FileInputStream("F:\\ExcelRead1.xlsx");
		w=new XSSFWorkbook(f);
		s=w.getSheet("Sheet1");
		Row r=s.getRow(a);
		Cell c=r.getCell(b);
		return c.getStringCellValue();
		
	}
public static String getintegerData(int a,int b ) throws IOException

{
	f=new FileInputStream("F:\\ExcelRead1.xlsx");
	w=new XSSFWorkbook(f);
	s=w.getSheet("Sheet1");
	Row r=s.getRow(a);
	Cell c=r.getCell(b);
	int x=(int)c.getNumericCellValue();
	return String.valueOf(x);
	
	
}
}
