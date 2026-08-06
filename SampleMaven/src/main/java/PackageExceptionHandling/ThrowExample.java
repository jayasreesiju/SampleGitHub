package PackageExceptionHandling;

public class ThrowExample {
	
	
	
	public static void main(String[] args) {
		
		
		int age=10;
		if (age>18)
		{
			System.out.println("eligible");
			
			
		}
		else

		{
			throw new ArithmeticException("not eligible");
			
		}
	}

}
