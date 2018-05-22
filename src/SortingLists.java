import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		int len1 = s1.length();
		int len2 = s2.length();
		
		if(len1 > len2){
			return 1;
		}
		else if(len1 < len2){
			return -1;
		}
		else
		return 0;
	}
	
}

class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String s1, String s2) {
		
		
		return -s1.compareTo(s2);
	}
	
}

public class SortingLists {

	public static void main(String[] args) {
	
		List<String> animals = new ArrayList<String>();
		
		animals.add("cat");
		animals.add("elephant");
		animals.add("tiger");
		animals.add("lion");
		animals.add("mongoose");
		
		//Collections.sort(animals, new StringLengthComparator());
		Collections.sort(animals, new ReverseAlphabeticalComparator());
		
		for(String animal : animals)
			System.out.println(animal);
		
		List<Integer> numbers = new ArrayList<Integer>();
		
		numbers.add(3);
		numbers.add(1);
		numbers.add(33);
		numbers.add(65);
		numbers.add(2);
		numbers.add(21);
		
		Collections.sort(numbers, new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				// TODO Auto-generated method stub
				return -o1.compareTo(o2);
			}
		});
		
		for(Integer number : numbers)
			System.out.println(number);
		
	}

}
