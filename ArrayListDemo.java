package javacollection;

import java.util.*;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList<Integer> ob=new ArrayList<>();
		ob.add(34);
		ob.add(56);
		ob.add(23);
		ob.add(45);
		ob.add(87);
		
		Iterator it=ob.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		

	}

}
