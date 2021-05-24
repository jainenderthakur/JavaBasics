package firstPackage;

import java.util.Scanner;

public class Test2 extends Test1{
	
	public Test2()
	{
		super(7, 8);
	}
	
	public void f1()
	{
		System.out.println("This is f1");
		System.out.println(super.a);
		super.m2();
	}
	
	public void f2()
	{
		int i=0;
		do
		{
			System.out.println("This is f2");
			i++;
		}
		while(i<5);
	}
	
	public void f3()
	{
		int i=0;
		while(i<5);
		{
			System.out.println("This is f3");
			i++;
		}
		
	}	
	
	public void f4()
	{
		
		System.out.println("Enter a number:");
		Scanner sc= new Scanner(System.in);
		int x= sc.nextInt();
		
		switch(x) {
		
		case 1:
			System.out.println("Monday");
			break;
			
		case 2:
			System.out.println("Tuesday");
			break;
			
		case 3:
			System.out.println("Wednesday");
			break;
			
		case 4:
			System.out.println("Thursday");
			break;
			
		case 5:
			System.out.println("Friday");
			break;
			
		case 6:
			System.out.println("Saturday");
			break;
			
		case 7:
			System.out.println("Sunday");
			break;
			
		default:
			System.out.println("Wrong input");	
		
		}		
	}
	
	public void f5(int x[])
	{
		for (int z: x)
		{
			System.out.println(z);
		}			
	}

	public void m4(int a, int b, int c)
	{
		System.out.println("Child class:"+(a+b+c));		
	}

	public static void main(String[] args) {
		
		Test2 t2=new Test2();	
//		t2.f1();
//		t2.m1();
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the values of variables");
		int x=sc.nextInt();
		int y=sc.nextInt();
		int z=sc.nextInt();
		t2.m4(x, y, z);		
		t2.f2();
		t2.f4();
	}

}