package collectionAPIsExamples;

import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class TreeMapExample {

	public static void main(String[] args) {

		TreeMap<Object, String> map = new TreeMap<Object, String>(new Mycomparator());
		map.put(2, "RAM");
		map.put(4, "Pune");
		map.put(1, "India");

		/*
		 * System.out.println(map.get("cName"));
		 * System.out.println(map.get("location"));
		 * System.out.println(map.get("country"));
		 */

		Set<Entry<Object, String>> e = map.entrySet();
		for (Entry<Object, String> x : e) {
			System.out.println(x);
		}

	}

}
