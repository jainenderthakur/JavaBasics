package firstPackage;

public class Arithemetic {
	
	public int sum (int x1, int x2) {
		
		int x3;
		x3=x1+x2;
		System.out.println("Sum of values is:" +x3);
		return x3;		
	}
	
	public int sub (int x4, int x5) {
		
		int x6;
		x6=x4-x5;
		System.out.println("Subtraction of values is:" +x6);
		return x6;		
	}
	
	public int mul (int x7, int x8) {
		
		int x9;
		x9=x7*x8;
		System.out.println("Multiplication of values is:" +x9);
		return x9;		
	}
	
	public int div (int x10, int x11) {
		
		int x12;
		x12=x10/x11;
		System.out.println("Division of values is:" +x12);
		return x12;
	}	
	

	public static void main(String[] args) {
		
		Arithemetic a=new Arithemetic();
		
		int result1= a.sum(10, 2);
		int result2= a.sub(result1, 2);
		int result3= a.sum(result2, 2);
		int result4= a.mul(result3, 2);
		int a1= a.div(result4, 2);
		System.out.println("Assignment 1 result is:" +a1);
		System.out.println(" ");
		int result5= a.div(10, 2);
		int result6= a.sum(result5, 2);
		int result7= a.sub(result6, 2);
		int result8= a.sum(result7, 2);
		int a2= a.mul(result8, 2);		
		System.out.println("Assignment 2 result is:" +a2);
				
	}

}