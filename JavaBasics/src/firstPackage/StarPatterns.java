package firstPackage;
import java.util.Scanner;

public class StarPatterns extends AbsTest implements Interface1 {

	public void pattern1(int x)
	{
		for (int i=0; i<x; i++)
		{
			for (int j=0; j<=i; j++)
			{
				System.out.print("*");	
			}
			System.out.println(" ");		
		}
		
	}
	
	public void pattern2(int x)
	{
		for (int i=x; i>0; i--)
		{			
			x--;
			
			for (int j=0; j<i; j++)
			{
				System.out.print("*");	
			}
			System.out.println(" ");		
		}
		
	}
	
	public void pattern3(int x)
	{
		for (int i=1; i<=x; i++)
		{
			for (int j=1; j<=i; j++)
			{
				System.out.print(j);	
			}
			System.out.println(" ");		
		}
		
	}
	
	public void pattern4(int x)
	{	
		int count=0;
		
		for (int i=1; i<=x; i++)
		{
			for (int j=1; j<=i; j++)
			{	
				count++;
				System.out.print(count);
				System.out.print(" ");
			}
			System.out.println(" ");		
		}
		
	}
	
	public void pattern5(int x)
	{	
		for (int i = 0; i < x; i++)
		{
			for (int j = 1; j < x-i; j++)
			{	
								
				System.out.print(" ");
			}	
			for (int j = 0; j <= i; j++) 
			{
				System.out.print("*");
			}
			System.out.println();
		}			
	}
	
	public void abs1()
	
	{
		System.out.println("Abstract method 1");
	}
	
	public void abs2()
	{
		System.out.println("Abstract method 2");
	}
	
	public void abs3()
	{
		System.out.println("Child class overided method");
	}
	
	public void intmet1()
	{
		System.out.println("Interface method 1");
	}
	
	public void intmet2()
	{
		System.out.println("Interface method 2");
	}
	
	public static void main(String[] args) 
	
	{
		int z=0;
		StarPatterns s = new StarPatterns();
	
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for which you want to create a pattern:");	
		int x = sc.nextInt();
		
		System.out.println(" ");
		s.abs1();
		s.abs2();
		s.abs3();
		s.intmet1();
		s.intmet2();
		System.out.println(z);
		System.out.println(StarPatterns.z);
		s.pattern5(x);
	}
}