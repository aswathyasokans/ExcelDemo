package excel;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excel {
	public static XSSFSheet sh;
	public static FileInputStream f;
	public static XSSFWorkbook w;
	
	public static String readStringData(int i,int j)throws IOException
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		f=new FileInputStream("\\Users\\ASWATHY ASOKAN\\Downloads\\MavenExcelRead\\target\\classes\\TestData.xlsx");

		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		XSSFRow r=sh.getRow(i);
		Cell c=r.getCell(j);
		return c.getStringCellValue();
	}
	

	public static String readIntegerData(int i,int j)throws IOException
	{
		String path=System.getProperty("user.dir");
		System.out.println(path);
		f=new FileInputStream("\\Users\\ASWATHY ASOKAN\\Downloads\\MavenExcelRead\\target\\classes\\TestData.xlsx");
		w=new XSSFWorkbook(f);
		sh=w.getSheet("sheet1");
		XSSFRow r=sh.getRow(i);
		Cell c=r.getCell(j);
		int a=(int)c.getNumericCellValue();
		return String.valueOf(a);
	}


}
