package superkeyword;

public class SupervariableChild extends SuperVariableParent{

	String color="yellow";
	
	public void print()
	{
		
		System.out.println(color);
		
		System.out.println(super.color);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub


		SupervariableChild obj1= new SupervariableChild();
		obj1.print();
		
	}

}
