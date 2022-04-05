package javacollection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

import javax.swing.text.html.HTMLDocument.Iterator;

public class ListIteratorA {

	public static void main(String[] args) {
		ListIterator<Integer> litr = null;
	    List<Integer> ob3 = new ArrayList<Integer>();
	   ob3.add(23);
	   ob3.add(32);
	   ob3.add(45);
	   ob3.add(54);
	   ob3.add(88);
	    //Obtaining list iterator
	    litr=ob3.listIterator();
	 
	    System.out.println("Traversing the list in forward direction:");
	    while(litr.hasNext()){
	       System.out.println(litr.next());
	    }
	    System.out.println("\nTraversing the list in backward direction:");
	    while(litr.hasPrevious()){
	       System.out.println(litr.previous());
	    }

	}

}
