import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;



public class SortedMapsReview {

	public static void main(String[] args) {
		//doesnt keep order
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		//keeps order of puting elements in
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		//keeps natural order (0-9, a-z, etc)
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();
		
		testMap(treeMap);
		
	}
	
	public static void testMap(Map<Integer, String> map){
		map.put(9, "cat");
		map.put(8, "fox");
		map.put(1, "god");
		map.put(0, "swan");
		map.put(6, "elephant");
		
		for(Integer key:map.keySet()){
			String value = map.get(key);
			
			System.out.println(key + ": " + value);
		}
	}

}
