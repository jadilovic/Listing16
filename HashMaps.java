package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> app = new HashMap<>();
		
		app.put(1, "One");
		app.put(3, "Three");
		app.put(2, "Two");
		app.put(55, "Five");
		app.put(7, "Seven");
		app.put(4, "Four");
		
		System.out.println(app.get(5));
		app.put(5, "Hello");
		System.out.println(app.get(5));
		
		for(Map.Entry<Integer, String> entry: app.entrySet()){
			int key = entry.getKey();
			String value = entry.getValue();
			System.out.println(key + ": " + value);
		}
	}

}
