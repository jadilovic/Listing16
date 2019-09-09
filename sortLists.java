package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class sortLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> animals = new ArrayList<>();
		animals.add("wolf");
		animals.add("tigar");
		animals.add("ant");
		animals.add("cow");
		animals.add("lion");
		animals.add("elephant");
		
		System.out.println(animals);
		Collections.sort(animals);
		System.out.println(animals);
		for(String animal: animals)
			System.out.print(animal + ", ");
		
		
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(6);
		numbers.add(2);
		
		System.out.println(numbers);
		Collections.sort(numbers);
		System.out.println(numbers);
		for(int number: numbers)
			System.out.print(number + ", ");
	}
}
