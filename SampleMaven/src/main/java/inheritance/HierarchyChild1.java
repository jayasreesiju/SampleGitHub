package inheritance;

public class HierarchyChild1 extends HierarchyParent{

	public void print1()
	{
		
		System.out.println("This is from Hierarchy child 1");
	}
	
	
public static void main(String args[])
	
	{
		
		HierarchyChild1 obj1=new HierarchyChild1();
	obj1.print();
	obj1.print1();
		
		
	}
	
}
