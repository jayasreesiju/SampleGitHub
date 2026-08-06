package PackageExceptionHandling;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class Iteratorclass {
public static void main(String[] args) {
	
	Set <Integer > a=new HashSet<Integer>();
	a.add(12);
	a.add(23);
	a.add(34);
	Iterator <Integer>it=a.interator();
	while(it.hasNext())
	{
		System.out.println(it.next());
		
	}
	
}
	
	
	
	
}
