package Setexample1;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		TreeSet<String>al=new TreeSet<String>();
		al.add("Riya");
		al.add("Vijay");
		al.add("Avanti");
		al.add("Pratham");
		al.add("Vijay");
		Iterator<String>it=al.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		System.out.println("Traversing element through Iterator in descending order");
		Iterator i=al.descendingIterator();
		while(i.hasNext())
		{
			System.out.println(i.next());
		}

	}

}
