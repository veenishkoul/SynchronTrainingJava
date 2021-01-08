package collectionAPIsExamples;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapExample {

	public static void main(String[] args) {

		HashMap<String, String> map = new HashMap<String, String>();
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
