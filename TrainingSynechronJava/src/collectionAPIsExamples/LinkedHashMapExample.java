package collectionAPIsExamples;

import java.util.LinkedHashMap;
import java.util.Map.Entry;
import java.util.Set;

public class LinkedHashMapExample {

	public static void main(String[] args) {

		LinkedHashMap<String, String> map = new LinkedHashMap<String, String>();
		map.put("cName", "RAM");
		map.put("location", "Pune");
		map.put("country", "India");

		/*
		 * System.out.println(map.get("cName"));
		 * System.out.println(map.get("location"));
		 * System.out.println(map.get("country"));
		 */

		Set<Entry<String, String>> e = map.entrySet();
		for (Entry<String, String> x : e) {
			System.out.println(x);
		}

	}

}
