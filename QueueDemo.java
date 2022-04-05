package edu.com;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		Queue<String>obq=new LinkedList<>();
		obq.add("Riya");
		obq.add("Avanti");
		obq.add("Shrishti");
		obq.add("Nehal");
		obq.peek();
		obq.element();
		obq.poll();
		System.out.println(obq);

	}

}
