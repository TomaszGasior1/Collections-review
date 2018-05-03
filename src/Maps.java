import java.util.HashMap;
import java.util.Map;

public class Maps {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		//hashmap doesnt keep order of keys/values
		map.put(5, "Five");
		map.put(8, "Eight");
		map.put(3, "Three");
		map.put(2, "Two");
		map.put(6, "Six");
		map.put(6, "Hello");
		
		String text = map.get(6);
		
		System.out.println(text);
		
		for(Map.Entry<Integer, String> entry:map.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key + ": " + value);
		}
		
	}

}
