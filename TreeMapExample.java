package Setexample1;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {
		TreeMap<Long,String> tmap = new TreeMap<Long,String>();
		tmap.put(9645342635L, "Priyanka");
		tmap.put(9563124585L, "Prathmesh");
		tmap.put(9963251434L, "Naresh");
		
		for (Map.Entry<Long,String> m : tmap.entrySet())
			 System.out.println(m.getKey() + " "
                     + m.getValue());


	}

}
