package Collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Person object
class NewPerson{
	private int id;
	private String name;
	
	public NewPerson(int id, String name){
		this.setId(id);
		this.setName(name);
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return id + ", " + name;
	}
}
// Compare by string length
class StringLengthComparator implements Comparator<String>{

	@Override
	public int compare(String animal1, String animal2) {
		if(animal1.length() > animal2.length())
			return 1;
		else if(animal1.length() < animal2.length())
			return -1;
		return 0;
	}
}

// Compare by reverse Alphabeticla order
class ReverseAlphabeticalComparator implements Comparator<String>{

	@Override
	public int compare(String a1, String a2){
		return -a1.compareTo(a2);
	}
}

public class sortLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Compare Strings
		List<String> per = new ArrayList<>();
		per.add("wolf");
		per.add("tigar");
		per.add("ant");
		per.add("cow");
		per.add("lion");
		per.add("elephant");
		
		System.out.println(per);
		// Collections.sort(per, new StringLengthComparator());
		Collections.sort(per, new ReverseAlphabeticalComparator());
		System.out.println(per);
		for(String animal: per)
			System.out.println(animal);
		
		// Compare numbers
		System.out.println();
		List<Integer> numbers = new ArrayList<>();
		numbers.add(5);
		numbers.add(3);
		numbers.add(1);
		numbers.add(4);
		numbers.add(6);
		numbers.add(2);
		
		System.out.println(numbers);
		
		//Collections.sort(numbers);
		Collections.sort(numbers, new Comparator<Integer>(){

			@Override
			public int compare(Integer num1, Integer num2) {
				// TODO Auto-generated method stub
				return -num1.compareTo(num2);
			}
		});
		System.out.println(numbers);
		for(int number: numbers)
			System.out.print(number + ", ");
		
		// Compare NewPersons
		List<NewPerson> per1 = new ArrayList<>();
		per1.add(new NewPerson(1, "joe"));
		per1.add(new NewPerson(3, "bill"));
		per1.add(new NewPerson(6, "chris"));
		per1.add(new NewPerson(2, "bob"));
		per1.add(new NewPerson(4, "wolf"));
		per1.add(new NewPerson(5, "steve"));
		
		System.out.println(per1);
		// Collections.sort(per, new StringLengthComparator());
		Collections.sort(per1, new Comparator<NewPerson>(){

			@Override
			public int compare(NewPerson o1, NewPerson o2) {
				if(o1.getId() > o2.getId())
					return 1;
				else if(o1.getId() < o2.getId())
					return -1;
				else
				return 0;
			}
			
		});
		System.out.println(per1);
		for(NewPerson p: per1)
			System.out.println(p);
		
		// Sort by name
		Collections.sort(per1, new Comparator<NewPerson>(){

			@Override
			public int compare(NewPerson o1, NewPerson o2) {
				return o1.getName().compareTo(o2.getName());
			}
			
		});
		System.out.println(per1);
		for(NewPerson p: per1)
			System.out.println(p);
	}
}
