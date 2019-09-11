package Collections;

import java.util.NoSuchElementException;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class queueList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Queue<Integer> ql1 = new ArrayBlockingQueue<Integer>(4);
		
		try{
			ql1.add(4);
			ql1.add(7);
			ql1.add(3);
			ql1.add(5);
		} catch(IllegalStateException e){
			System.out.println("Queue is full. Cannot add more elements");
		}
		
		if(ql1.offer(9) == false)
			System.out.println("Offer failed to add new item");
		System.out.println(ql1.offer(9));
		System.out.println(ql1.poll());
		System.out.println(ql1.peek());
		
		System.out.println("Show the head of the queue: " + ql1.element());
		
		try{
		System.out.println("Removed item from the queue: " + ql1.remove());
		System.out.println("Removed item from the queue: " + ql1.remove());
		System.out.println("Removed item from the queue: " + ql1.remove());
		System.out.println("Removed item from the queue: " + ql1.remove());
		System.out.println("Show the head of the queue: " + ql1.element());
		} catch(NoSuchElementException e){
			System.out.println("Tried to remove too many items from the queue");
		}
		
		System.out.println(ql1.peek());
		System.out.println(ql1.poll());
		for(Integer num: ql1)
			System.out.println("Preostali element u queue: " + num);
	}

}
