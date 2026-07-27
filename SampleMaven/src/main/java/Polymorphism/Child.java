package Polymorphism;

public class Child extends Parent{

	public void print(int a,int b,int c) {
		int d=a+b+c; 
		super.print(45, 37, 25);
		System.out.println("From child sum" +d);

	}

public static void main(String args[])
{
	
	Child obj1=new Child();
	obj1.print(34, 10,10);

}


}
