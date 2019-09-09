package Collections;

import java.util.HashMap;
import java.util.Map;

public class Map2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashMap<Integer, String> map = new HashMap<>();
		map.put(7, "nedelja");
		map.put(6, "subota");
		map.put(5, "petak");
		map.put(3, "srijeda");
		map.put(2, "utorak");
		map.put(4, "cetvrtak");
		map.put(1, "ponedeljak");
		
		map.put(3, "WED");
		map.put(77, "SUN");
		
		for(Map.Entry<Integer, String> list: map.entrySet()){
			System.out.println(list.getKey() + ": " + list.getValue());
		}
	}

}
