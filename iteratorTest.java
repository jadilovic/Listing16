package Collections;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class iteratorTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		LinkedList<Integer> list = new LinkedList<>();
		list.add(5);
		list.add(7);
		list.add(9);
		list.add(3);
		
		ListIterator<Integer> it = (ListIterator<Integer>) list.iterator();
		
		while(it.hasNext()){
			Integer value = it.next();
			System.out.println(value);
			if(value == 9)
			it.remove();
			if(value == 7)
				it.add(8);
		}
		System.out.println();
		for(Integer num: list)
			System.out.println(num);
	}

}
