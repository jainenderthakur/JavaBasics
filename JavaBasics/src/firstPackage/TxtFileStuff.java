package firstPackage;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class TxtFileStuff {

	public void read1() throws IOException
	{
		File f = new File("../JavaBasics/input.txt");
		FileReader fr=new FileReader(f);
		
		int a;
		while((a=fr.read())!=-1)
		{
			System.out.println((char)a);
		}
		
	}
	
	public void read2() throws IOException
	{
		File f = new File("../JavaBasics/input.txt");
		FileReader fr=new FileReader(f);
		BufferedReader b = new BufferedReader(fr);
		
		String s;
		while((s=b.readLine())!=null)
		{
			System.out.println(s);
		}
		
	}
	
//	public void read3(int r) throws IOException
//	{
//		File f = new File("../JavaBasics/input.txt");
//		FileReader fr=new FileReader(f);
//		BufferedReader b = new BufferedReader(fr);
//		
//		int l=0;
//		String s;
//		while(((s=b.readLine())!=null))
//		{	
//			l=l+1;
//			
//			if(l=r);
//			{
//				System.out.println(s);	
//			}
//			
//		}
//		
//	}
	
	public void write1() throws IOException
	{
		File f = new File("../JavaBasics/input2.txt");
		FileWriter fw=new FileWriter(f);
		fw.write("Hello world");
		fw.close(); //for saving and closing the file
		
	}
	
	public void write2() throws IOException
	{
		File f = new File("../JavaBasics/input2.txt");
		FileWriter fw=new FileWriter(f);
		BufferedWriter br= new BufferedWriter(fw);		
		br.write("Hello world");
		br.newLine();
		br.write("Hello again world");
		br.close();//for saving and closing the file		
	}
	
	public void write3() throws IOException
	{
		File f = new File("../JavaBasics/input2.txt");
		FileWriter fw=new FileWriter(f, true);
		BufferedWriter br= new BufferedWriter(fw);	
		br.newLine();
		br.write("Hello world2");
		br.newLine();
		br.write("Hello again world2");
		br.close();//for saving and closing the file		
	}
	
	public static void main(String[] args) throws IOException {
		
		TxtFileStuff t =new TxtFileStuff();
		t.write3();	

	}

}