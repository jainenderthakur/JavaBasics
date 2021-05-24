package firstPackage;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;

public class XlsFileHandle {	

	public static void main(String[] args) throws BiffException, IOException, RowsExceededException, WriteException {
		XlsFileHandle x = new XlsFileHandle();
		x.write2();		
	}
	
	public void read1() throws BiffException, IOException
	{
		File f=new File("../JavaBasics/inputx1.xls");
		Workbook wk= Workbook.getWorkbook(f);
		Sheet ws=wk.getSheet(0);
		int r=ws.getRows();
		int c=ws.getColumns();
		
		for(int i=0;i<r;i++)
		{
			for(int j=0;j<c;j++)
			{
				Cell c1=ws.getCell(j,i);
				System.out.println(c1.getContents());
			}
		}		
	}	
	
	public void write1() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f=new File("../JavaBasics/inputx2.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Jainender", 0);
			
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Label L=new Label(j,i,"test");
				ws.addCell(L);
			}
		}
		wk.write();
		wk.close();
	}
	
	public void write2() throws BiffException, IOException, RowsExceededException, WriteException
	{
		File f=new File("../JavaBasics/inputx2.xls");
		WritableWorkbook wk= Workbook.createWorkbook(f);
		WritableSheet ws=wk.createSheet("Jainender", 0);
		Scanner s=new Scanner(System.in);
		System.out.println("Please enter the data:");
		String data = s.next();
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				Label L=new Label(j,i,data);
				ws.addCell(L);
			}
		}
		wk.write();
		wk.close();
	}	
}