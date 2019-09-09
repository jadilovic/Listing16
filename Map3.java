package Collections;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Map3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer, String> hashMap = new HashMap<>();
		Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
		Map<Integer, String> treeMap = new TreeMap<>();
		
		showMap(hashMap);
		showMap(linkedHashMap);
		showMap(treeMap);
	}

	private static void showMap(Map<Integer, String> map) {
		for(int i = 0; i < 10; i++){
			int key = (int) (Math.random() * 20) + 1;
			map.put(key, "value"+key);
			System.out.print(key + ", ");
		}
		System.out.println();
		System.out.println(map.getClass());
		for(Map.Entry<Integer, String> list: map.entrySet()){
			System.out.println(list.getKey() + ": " + list.getValue());
		}
		
		System.out.println();
		
		for(Integer key: map.keySet()){
			System.out.println(key + ": " + map.get(key));
		}
		System.out.println();
		System.out.println("Start of new set: ");
	}

}
