package Setexample1;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		LinkedHashSet<String>al1=new LinkedHashSet<String>();
		al1.add("Rutu");
		al1.add("Teju");
		al1.add("Piyu");
		al1.add("Rutu");
		al1.add("Teju");
		
		Iterator<String>itr=al1.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		

	}

}
