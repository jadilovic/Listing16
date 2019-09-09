package Collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class linkedLists {

	public static void main(String[] args) {
		
		List<Integer> al = new ArrayList<>();
		List<Integer> ll = new LinkedList<>();
		
		speedOfAddingNewElements("Array", al);
		speedOfAddingNewElements("Linked", ll);
		
		}
	
	private static void speedOfAddingNewElements(String listType, List<Integer> list) {
		
		for(int i = 0; i < 1E5; i++){
			list.add(i);
		}
		
		long start = System.currentTimeMillis();
		
		for(int i = 0; i < 1E5; i++){
			list.add(list.size() - 300, i);
		}
		
		long end = System.currentTimeMillis();
		
		System.out.println("Time it took to do the taske for " + listType + " is: " + (end - start));
	}

}
