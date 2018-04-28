import java.util.ArrayList;
import java.util.List;

public class ArrayListReview {

	public static void main(String[] args) {
		ArrayList<Integer> numbers = new ArrayList<Integer>();

		// adding
		numbers.add(10);
		numbers.add(100);
		numbers.add(40);

		// Retrieving
		System.out.println(numbers.get(0));

		// Loop
		System.out.println("\nIteration #1: ");
		for (int i = 0; i < numbers.size(); i++)
			System.out.println(numbers.get(i));

		// Removing
		numbers.remove(numbers.size() - 1);

		// this is very slow
		numbers.remove(0);

		// 2nd way
		System.out.println("\nIteration #2: ");
		for (Integer value : numbers)
			System.out.println(value);
		
		//List interface..
		
		List<String> values = new ArrayList<String>();
		

	}

}
