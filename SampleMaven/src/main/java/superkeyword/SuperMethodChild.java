package superkeyword;

public class SuperMethodChild extends SuperMethodParent{


public void print ()

{
	

	System.out.println("From child class");
super.print();

}


public static void main (String args[])
{
	SuperMethodChild obj1= new SuperMethodChild();
	obj1.print();
	

}





}
