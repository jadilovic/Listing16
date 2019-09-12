package Collections;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class dataStructure {
	
	public static String[] vehicles = {"Car", "Bus", "Truck"};
	
	public static String[][] drivers = {{"Bob", "Jim", "Rod"},
						{"Chris", "Will", "Rocky", "Mark"},
						{"Don", "Steve", "Susan"}};

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, Set<String>> list = new LinkedHashMap<>();
		
		for(int i = 0; i < vehicles.length; i++){
			String vehicle = vehicles[i];
			System.out.print(vehicle + ": ");
			String[] driversGroup = drivers[i];
			for(int j = 0; j < driversGroup.length; j++){
				System.out.print(driversGroup[j] + ", ");
			}
			System.out.println();
		}
	}
}
