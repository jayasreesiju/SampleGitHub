package superkeyword;

public class SuperConstructChild extends SuperConstructParent{

	public SuperConstructChild() {
		
		super();
		
		// Can be used to invoke single parameterised constructor ---> super(88);
		
		System.out.println("This is a default constructor from child");
	}

public SuperConstructChild(int a) {
		
		super(345,456);
		
		System.out.println("This is a single constructor from child");
	}
	
	
	
	public static void main(String[] args) {
		
		SuperConstructChild obj1=new SuperConstructChild();
		
		SuperConstructChild obj2=new SuperConstructChild(67);
		
	}

}
