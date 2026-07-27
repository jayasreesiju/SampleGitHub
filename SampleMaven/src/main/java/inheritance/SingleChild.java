package inheritance;

public class SingleChild extends SingleParent{
	
	
	public void sub()
	{
		
		int a=10;
		int b=5;
		int c=a-b;
		System.out.println("the sub is "+c);
	}
	
	public static void main (String args[])
	{
		SingleChild obj1=new SingleChild();
		obj1.sum();
		obj1.sub();
		
		
	}
	

}
