package Assignments;

/*➢ Write a program to find the grade of 2 students based on total marks(3 subjects)
• Get the student‟s marks by constructor • Return total mark to in main method •
Find the grade of each student. ➢ Write a program to find the • Average of three
integer numbers, three float numbers(should have same method name) • Area of
figures(circle, rectangle, square) by using three methods(should have same
method name)*/


public class Methods {
	
	int mark1;
	int mark2;
	int mark3;
	
	
	public Methods(int mark1,int mark2, int mark3)
	{
		
		this.mark1= mark1;
		this.mark2= mark2;
		this.mark3= mark3;
		
	}
	
	
	public int total()
	{
		int total=mark1+mark2+mark3;
		
		return total;
	}
	
	
	public static void main(String args[])
	{
		int sum=mark1+mark2+mark3;
		
		Methods obj1-new Methods(23,24,45);
		Methods obj2=new Methods(34,32,34);
		if (obj1.total())>120)
       {
		System.out.println("Grade A");
       }
       else if (obj1.total())>10)
       
       {
    	   System.out.println("Grade B");
       }

       else if ((obj1.total())>75)

      {
	   System.out.println("Grade B");
      }
       
       else
    	   
       {
    	   System.out.println("Grade B");
       }
		
		obj2.total();
		
		
		
		
	}

}
