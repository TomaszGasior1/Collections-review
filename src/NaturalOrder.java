import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

class Personn implements Comparable<Personn> {
	private String name;
	
	public Personn(String name){
		this.name = name;
	}
	
	public String toString(){
	return name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Personn other = (Personn) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Personn p) {
		
		return -name.compareTo(p.name);
	}
}

public class NaturalOrder {

	public static void main(String[] args) {
		List<Personn> list = new ArrayList<Personn>();
		
		Set<Personn> set = new TreeSet<Personn>();
		
		addElements(list);
		addElements(set);
		
		Collections.sort(list);
		
		showElements(list);
		System.out.println();
		showElements(set);

	}
	
	private static void addElements(Collection<Personn> col){
		col.add(new Personn("Joe"));
		col.add(new Personn("Sue"));
		col.add(new Personn("Juliet"));
		col.add(new Personn("Clare"));
		col.add(new Personn("Mike"));
	}
	
	private static void showElements(Collection<Personn> col){
		for(Personn element: col)
			System.out.println(element);
	}

}
