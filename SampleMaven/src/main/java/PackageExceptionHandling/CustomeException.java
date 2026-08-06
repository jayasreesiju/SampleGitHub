package PackageExceptionHandling;

public class CustomeException {

	public static void main(String[] args) throws VotingException {
		
		
		int age=10;
		if (age>18)
		{
			System.out.println("eligible");
			
			
		}
		else

		{
			throw new VotingException("not eligible");
			
		}
	}

}
