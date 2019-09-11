package Collections;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;

class Person{
	private int id;
	private String name;
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + getId();
		result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
		return result;
	}

	private Object getName() {
		// TODO Auto-generated method stub
		return name;
	}

	private int getId() {
		// TODO Auto-generated method stub
		return id;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Person other = (Person) obj;
		if (getId() != other.getId())
			return false;
		if (getName() == null) {
			if (other.getName() != null)
				return false;
		} else if (!getName().equals(other.getName()))
			return false;
		return true;
	}

	public Person(int id, String name){
		this.setId(id);
		this.setName(name);
	}
	
	private void setName(String name2) {
		name = name2;
		
	}

	private void setId(int id2) {
		id = id2;
	}

	@Override
	public String toString(){
		return "ID is " + getId() + " and name is " + getName(); 
	}
}

public class Map4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Person p1 = new Person(1, "aki");
		Person p2 = new Person(2, "cuni");
		Person p3 = new Person(1, "aki");
		Person p4 = new Person(3, "mak");

		Map<Person, Integer> app = new LinkedHashMap<>();
		app.put(p1, 1);
		app.put(p2, 2);
		app.put(p3, 1);
		app.put(p4, 3);
		
		System.out.println(app);
		for(Person key: app.keySet())
			System.out.println(key + ": " + app.get(key));
		
		Set<Person> app2 = new LinkedHashSet<>();
		app2.add(p1);
		app2.add(p2);
		app2.add(p3);
		app2.add(p4);
		System.out.println(app2);
		for(Person person: app2)
			System.out.println(person);
	}
}
