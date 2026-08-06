package PackageExceptionHandling;
import java.util.HashSet;
import java.util.Set;
public class GenricSetMethods {
	public static void main(String[] args) {
		
		Set <Integer > a=new HashSet<Integer>();
		a.add(12);
		a.add(23);
		a.add(34);
		
		Set<Integer> a1=new HashSet<Integer>();
		a1.add(23);
		a1.add(34);
		a1.add(35);
		
		a.addAll(a1);
		
		System.out.println("Union of sets: " + a);
		System.out.println("Union of sets: " +a.contains(35));
		
		//Containsall
		
		System.out.println("Union of sets: " +a.containsAll(a1));
		System.out.println("Union of sets: " +a1.containsAll(a));
		
		
		//isempty
		System.out.println("Union of sets: " +a.isEmpty());
		System.out.println("Union of sets: " +a1.isEmpty());
		
		//remove
		
		System.out.println("Union of sets: " +a.remove(34));
		System.out.println("Union of sets: " +a1.remove(34));
		
		//remove all
		System.out.println("Union of sets: " +a.removeAll(a1));
		System.out.println("Union of sets: " +a1.removeAll(a));
		
		//size
		System.out.println("Union of sets: " +a.size());
		System.out.println("Union of sets: " +a1.size());
		
		//clear
		
		a.clear();
		a1.clear();
		System.out.println("Union of sets: " +a);
		System.out.println("Union of sets: " +a1);
		
		
	}

}
