import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetsBasicReview {

	public static void main(String[] args) {

		// HashSet does not retain order.
		// Set<String> set1 = new HashSet<String>();

		// LinkedHashSet remembers the order you added items in
		// Set<String> set1 = new LinkedHashSet<String>();

		// Treeset sorts in natural order
		Set<String> set1 = new TreeSet<String>();

		if (set1.isEmpty())
			System.out.println("Set is empty.");

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("snake");
		set1.add("bear");

		if (set1.isEmpty())
			System.out.println("Set is empty.");

		// Sets dont contain duplicated items
		set1.add("mouse");

		System.out.println(set1);

		// iteration

		for (String element : set1) {
			System.out.println(element);
		}

		// does set contain a given item?
		if (set1.contains("asdasd"))
			System.out.println("Contains asdasd");

		if (set1.contains("cat"))
			System.out.println("Contains cat");

		// Intersection

		Set<String> set2 = new TreeSet<String>();

		set2.add("dog");
		set2.add("cat");
		set2.add("giraffee");
		set2.add("monkey");
		set2.add("ant");

		Set<String> intersection = new HashSet<String>(set1);

		intersection.retainAll(set2);

		System.out.println(intersection);
	}

}
