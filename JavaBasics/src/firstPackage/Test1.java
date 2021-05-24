package firstPackage;

public class Test1 {
	int a;
	int b;
	
	public Test1()
	{	
	this(3,3);
	}
	
	public Test1(int a, int b)
	{
		this.a=a;
		this.b=b;		
	}
	
	public void m1()
	{	
		System.out.println("This is m1");
		System.out.println(a+"&"+b);
	}
	
	public void m2()
	{
		System.out.println("This is m2");
	}
	
	public void m3(int a, int b)
	{			
		this.m1();		
		System.out.println("This is m3"+a+b);
	}	
	
	public void m4(int a, int b, int c)
	{
		System.out.println("Parent class:"+a+b+c);		
	}
	
	public void m4(int a, int b, int c, int d)
	{
		System.out.println(a+b+c+d);
	}

	public static void main(String[] args) {
		
		Test1 t1=new Test1();
//		t1.m3(4,5);
		t1.m4(1, 2, 3, 4);
		t1.m4(3, 4, 5);

	}

}