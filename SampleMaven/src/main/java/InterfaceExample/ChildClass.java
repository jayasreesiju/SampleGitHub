package InterfaceExample;

public class ChildClass implements ParentInterface1,ParentInterface2{

	
	public void print(int a) {
		
		System.out.println("A is"+a);
		
	}

	@Override
	public void print(int a, int b, int c) {
	int c=a+b;
	System.out.println("C is"+c);
		
	}



	@Override
	public void cprint(int a, int b) {
		int d=a+b+c
		System.out.println("D is"+d);
		
	}

	
	public static void main(String[] args) {
		ChildClass obj2=new ChildClass();
		obj2.print(340);
		
		obj2.print(30, 40, 40);

	}
}
