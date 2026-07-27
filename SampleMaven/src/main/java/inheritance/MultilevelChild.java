package inheritance;

public class MultilevelChild extends MultilevelParent{
	
	
	public void print2()
{
	
	System.out.println("This is from Child");
	
	
}
	
	
	public static void main (String args[])
	{
		MultilevelChild obj1=new MultilevelChild();
		obj1.print();
		obj1.print1();
		obj1.print2();
		
	}


}
