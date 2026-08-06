package InterfaceExample;

public class Child implements Parent{

	

	@Override
	public void display() {
		System.out.println("Displayed from child");
		
	}

	@Override
	public void print(int a, int b) {
		int c=a+b;
		System.out.println("C is"+c);
		
	}
	public void Cprint(int a) {
		
		System.out.println("a is"+a);
		
	}
	
	

	public static void main(String[] args) {
		Child obj=new Child();
		Parent obj1=new Child();/*ref creation for interface*/
		obj1.display();
		obj1.print(30,30);
		obj.print(45,60);
		obj.Cprint(288980);
		
		obj.display();

	}
	}
