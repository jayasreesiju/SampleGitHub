package superkeyword;

public class SuperConstructParent {
	
	public SuperConstructParent()
	{
		System.out.println("This is a default constructor from parent");
	}
	
	public SuperConstructParent(int a)
	{
		
		System.out.println("The variable is "+a);
		
		System.out.println("This is a single parameter constructor from parent");
	}
	
	public SuperConstructParent(int a, int b)
	{
		
		System.out.println("The variables are "+a+b);
		
		System.out.println("This is a two parameter constructor from parent");
	}
	
	

}
