package collectionAPIsExamples;

import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {

		//Order is preserved
		//Dynamic array stores unique values
		//Serializable, cloanable, no randomAccess
		//No Get method

		LinkedHashSet<Object> l = new LinkedHashSet<Object>();
		l.add("A");
		l.add("B");
		l.add("C");
		l.add("D");
		l.add("A");
		l.add("B");
		System.out.println(l);

		//l.iterator();
		//For each loop

		//Constructors

		//1. LinkedHashSet<Object> l = new LinkedHashSet<Object>();
		//2. LinkedHashSet<Object> l = new LinkedHashSet<Object>(int intialcapacity);
		//3. LinkedHashSet<Object> l = new LinkedHashSet<Object>(int intialcapacity, float loadcapacity);
		//4. LinkedHashSet<Object> l = new LinkedHashSet<Object>(Collection c);

	}

}
