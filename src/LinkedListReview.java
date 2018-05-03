import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListReview {

	public static void main(String[] args) {
	
		ArrayList<Integer> arrayList = new ArrayList<Integer>();
		LinkedList<Integer> linkedList = new LinkedList<>();
		
		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
		
	}
	
	public static void doTimings(String type, List<Integer> list){
		
		for(int i=0; i<1E5; i++){
			list.add(i);
		}
		long start = System.currentTimeMillis();
		
		/*
		// Add items at the end of list
		for (int i = 0; i<1E5; i++){
			list.add(i);
		}
		*/
		
		
		//Add items elsewhere
		for(int i=0; i<1E5; i++){
			list.add(list.size()-10000, i);
		}
		
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time taken: " + (end-start) + " ms for " + type);
	}

}
