package acessmodifiers;

public class Acess1 {

	public Acess1() {
		// TODO Auto-generated constructor stub
	}

	
	public void Public1()
	{
		System.out.println("public");
	}
	
	private void Private2()
	{
		System.out.println("private");
	}
	protected void Protected3()
	{
		System.out.println("Protected");
	}
	 void Default4()
	{
	System.out.println("default");
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Acess1 obj1=new Acess1();
		obj1.Public1();
		obj1.Private2();
		obj1.Protected3();
		obj1.Default4();
	
	}

}
