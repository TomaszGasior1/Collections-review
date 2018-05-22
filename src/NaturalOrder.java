import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class NaturalOrder {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		
		Set<String> set = new TreeSet<String>();
		

	}
	
	private static void addElements(Collection<String> col){
		col.add("Joe");
		col.add("Sue");
		col.add("Juliet");
		col.add("Clare");
		col.add("Mike");
	}
	
	private static void showElements(Collection<String> col){
		for(String element: col)
			System.out.println(element);
	}

}
