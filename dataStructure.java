package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
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
			String[] driversGroup = drivers[i];
			Set<String> driversList = new LinkedHashSet<>();
			for(String driver: driversGroup)
				driversList.add(driver);
			list.put(vehicle, driversList);
		}
		
		System.out.println("Drivers for a car are: " + list.get("Car"));
		System.out.println("Drivers for a car are: " + list.get("Bus"));
		System.out.println("Drivers for a car are: " + list.get("Truck"));
		
		Set<String> driversSet = list.get("Bus");
		for(String driver: driversSet)
			System.out.println(driver);
		
		driversSet.remove("Rocky");
		
		System.out.println("Drivers for a car are: " + list.get("Car"));
		System.out.println("Drivers for a car are: " + list.get("Bus"));
		System.out.println("Drivers for a car are: " + list.get("Truck"));
		
		for(String vehicleSet: list.keySet()){
			System.out.println();
			System.out.print(vehicleSet + ": ");
			for(String drivers: list.get(vehicleSet))
				System.out.print(drivers + ", ");
		}	
	}
}
