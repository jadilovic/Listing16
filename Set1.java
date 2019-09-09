package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Set1 {

	public static void main(String[] args) {

		Set<String> appHash = new HashSet<>();
		Set<String> appLinked = new LinkedHashSet<>();
		Set<String> appTree = new TreeSet<>();
		
		// toFillSets(appHash);
		toFillSets(appLinked);
		// toFillSets(appTree);
	}

	private static void toFillSets(Set<String> set) {
		// TODO Auto-generated method stub
		System.out.println("Prije popune set " + set.getClass() + " is empty? " + set.isEmpty());
			set.add("ponedeljak");
			set.add("utorak");
			set.add("srijeda");
			set.add("cetvrtak");
			set.add("petak");
			set.add("subota");
			set.add("nedelja");
			set.add("monday");
			set.add("tuesday");
			// System.out.println("set to string: \n" + set.toString());
			System.out.println(set);
			System.out.println(set.isEmpty());
			System.out.println(set.contains("subota"));
			//for(String element: set){
			//	System.out.println(element);
			//}
		//	set.add("petak");
		//	System.out.println("dodan petak");
		//	System.out.println(set);
			
			Set<String> set2 = new LinkedHashSet<>();
			set2.add("wendsday");
			set2.add("thursday");
			set2.add("friday");
			set2.add("cetvrtak");
			set2.add("petak");
			set2.add("subota");
			set2.add("nedelja");
			set2.add("monday");
			set2.add("tuesday");
			System.out.println("Set 2 is: \n" + set2);
			Set<String> intersection = new LinkedHashSet<>(set);
			// ostaju samo koji su isti intersection
			intersection.retainAll(set2);
			System.out.println(intersection);
			
			Set<String> difference = new LinkedHashSet<>(set);
			difference.removeAll(set2);
			System.out.println(difference);
			
			Set<String> difference2 = new LinkedHashSet<>(set2);
			difference2.removeAll(set);
			System.out.println(difference2);
	}

}
