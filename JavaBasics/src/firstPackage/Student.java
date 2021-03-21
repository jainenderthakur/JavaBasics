package firstPackage;

public class Student {

	int age;
	int roll_no;
	
	public void method1() {
		System.out.println("Welcome all");
	}
	
	public void method2() {
		System.out.println("Automation is easy");
	}
		
	public static void main(String[] args) {
		
		Student jainender=new Student();
		System.out.println(jainender.age=28);
		System.out.println(jainender.roll_no=3442);
		jainender.method1();
		jainender.method2();
	}

}