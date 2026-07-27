package inheritance;

import acessmodifiers.Acess1;

public class Access3 extends Acess1{

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub}
		Acess1 obj1=new Acess1();
		obj1.Public1();
		Access3 obj3= new Access3();
		obj3.Protected3();
		obj3.Public1();
	}
}
