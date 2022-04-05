package Setexample1;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

	public static void main(String[] args) {
		HashMap<Long,String> map = new HashMap<Long,String>();
		map.put(9645342635L, "Priyanka");
		map.put(9563124585L, "Prathmesh");
		map.put(9963251434L, "Naresh");
		
		for (Map.Entry<Long,String> m : map.entrySet())
			 System.out.println(m.getKey() + " "
                     + m.getValue());
		
		
		

	}

}
