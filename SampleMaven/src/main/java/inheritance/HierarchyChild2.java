package inheritance;

public class HierarchyChild2 extends HierarchyParent{
	
	public void print2()
	{
		
		System.out.println("This is from HierarchyChild2");
	}
	
	public static void main(String args[])
	
	{
		
		HierarchyChild2 obj1=new HierarchyChild2();
		obj1.print2();
		obj1.print();
		
		
		
		
	}
	
	

}
