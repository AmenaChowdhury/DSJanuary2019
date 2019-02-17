package ds;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class UseHashMap {

	public static void main(String[] args) {
		Map<String, String> map = new LinkedHashMap<String,String>();
		map.put("USA", "New York");
		map.put("UK", "London");
		map.put("Bangladesh", "Dhaka");
		map.put("Canada", "Montreal");
		
		for(Entry<String, String> country:map.entrySet()) {
		       System.out.println(country.getKey()+ " "+ country.getValue());
		}
		

	}

}
