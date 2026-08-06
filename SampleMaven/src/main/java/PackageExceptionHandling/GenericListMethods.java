package PackageExceptionHandling;
import java.util.ArrayList;
import java.util.List;

public class GenericListMethods {
	
	public static void main(String[] args) {
		List <String> s = new ArrayList <String>();
		//add() method
		s.add("apple");
		s.add("orange");
		s.add("kiwi");
		s.add("mango");
		System.out.println(s);

		//get() method
		System.out.println(s.get(3)); //mango

		//set() method
		s.set(1, "watermelon");
	System.out.println(s);//	
	}
	
	
}
