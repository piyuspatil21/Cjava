package elevatordrivercom;

import java.util.ArrayList;
import java.util.Iterator;

public class RemoveDuplicate {

	public static void main(String[] args) {
		String []names= {"Mohini","Shabariraj","Vivek","Vivek","Raj","Mohini"};
		ArrayList<String>al = new ArrayList<>();
		for(String s:names) {
			if(!(al.contains(s))) {
				al.add(s);
				
				
			}
		}
		Iterator it=al.iterator();
		System.out.println("After removing duplicate names");
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		 
	    }
	}


