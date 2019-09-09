package Collections;

import java.util.LinkedHashMap;
import java.util.Map;

public class Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Integer> app = new LinkedHashMap<>();
		app.put("one", 1);
		app.put("two", 2);
		app.put("three", 3);
		app.put("one", 1);
		
		System.out.println(app);
		for(String key: app.keySet())
			System.out.println(key + ": " + app.get(key));
	}
}
