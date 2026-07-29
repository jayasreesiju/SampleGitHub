package Abstraction;

public class Child extends Parent{

	@Override
	public void display() {
		System.out.println("Hello displayed");
		
	}

	@Override
	public void total() {
		System.out.println("total marks is 100");
		
	}
	
	public static void main(String[] args) {
		Child obj=new Child();
		obj.display();
		obj.total();
	}

}
