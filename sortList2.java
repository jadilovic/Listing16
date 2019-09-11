package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;

class Person2 implements Comparable<Person2>{
	private String name;
	
	public Person2(String name){
		this.name = name;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person2 other = (Person2) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public int compareTo(Person2 element) {
		if(name.length() > element.name.length())
			return 1;
		else if(name.length() < element.name.length())
			return -1;
		return name.compareTo(element.getName());
	}

	//@return the name
	public String getName() {
		return name;
	}

}

public class sortList2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Person2> al = new ArrayList<>();
		SortedSet<Person2> sl = new TreeSet<>();
		
		addElements(al);
		addElements(sl);
		Collections.sort(al);
		
		showElements(al);
		System.out.println();
		showElements(sl);
	}

	private static void showElements(Collection<Person2> elements) {

		for(Person2 elem: elements)
		System.out.println(elem.getName());
	}

	private static void addElements(Collection<Person2> elements) {
		elements.add(new Person2("Johny"));
		elements.add(new Person2("Bob"));
		elements.add(new Person2("Borislav"));
		elements.add(new Person2("Vicky"));
		elements.add(new Person2("Robert"));
		elements.add(new Person2("Bony"));
	}
}
