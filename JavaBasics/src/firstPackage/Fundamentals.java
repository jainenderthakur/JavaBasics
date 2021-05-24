package firstPackage;

public class Fundamentals extends StarPatterns{

	static int a;
	final int b=1;
	int c;
	
	public void print()
	{
		a++;
		System.out.println(a);
		
		c++;
		System.out.println(c);
	}
	
	public static void display()
	{
		System.out.println("Static method");
	}
	
	public static void main(String[] args) {
	
		Fundamentals f= new Fundamentals();
		Fundamentals f1= new Fundamentals();
		f.print();
//		f.print();
		f1.print();
		
		Fundamentals.display();
		System.out.println(Fundamentals.a);

	}

}