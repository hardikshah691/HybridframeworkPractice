package Generic;

import java.io.FileInputStream;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class Excel {

	public static String getdata(String filepath,String sheet,int row,int cell)
	{
		String s="";
		System.out.println("hello");
		try
		{
		System.out.println("In try");
		
		FileInputStream f=new FileInputStream(filepath);
		System.out.println("after fileinputstream");
		
		Workbook wb = WorkbookFactory.create(f);
		System.out.println("after workbook");
		
		s=wb.getSheet(sheet).getRow(row).getCell(cell).getStringCellValue();
		}
		catch(Exception e)
		{
			
		}
		return s;
	
	}
}
