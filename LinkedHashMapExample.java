package Setexample1;


import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {

	public static void main(String[] args) {
		LinkedHashMap<Long,String> lmap = new LinkedHashMap<Long,String>();
		lmap.put(9645342635L, "Priyanka");
		lmap.put(9563124585L, "Prathmesh");
		lmap.put(9963251434L, "Naresh");
		
		for (Map.Entry<Long,String> m : lmap.entrySet())
			 System.out.println(m.getKey() + " "
                     + m.getValue());

	}

}
