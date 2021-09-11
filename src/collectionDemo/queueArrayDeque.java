package collectionDemo;

import java.util.ArrayDeque;
import java.util.Queue;

public class queueArrayDeque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<Integer>q = new ArrayDeque<Integer>();
		q.add(5);
		q.add(55);
		
		q.add(444);
		System.out.println(q.peek());
		System.out.println(q.element());
		System.out.println(q.poll()); 
		System.out.println(q.peek());
		

	}

}
