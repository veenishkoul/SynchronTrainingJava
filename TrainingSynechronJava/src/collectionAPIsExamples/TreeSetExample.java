package collectionAPIsExamples;

import java.util.TreeSet;

public class TreeSetExample {

	public static void main(String[] args) {
		// NavigableSet interface is implemented using TreeSet Class
		//Sorting order is ascending order

		TreeSet<Integer> t = new TreeSet<Integer>();
		t.add(4);
		t.add(3);
		t.add(0);
		t.add(2);
		t.add(2);
		t.add(7);

		System.out.println(t);
		//t.iterator()
		//foreach loop

		//Constructors
		// 1. TreeSet<Object> t = new TreeSet<Object>();
		// 2. TreeSet<Object> t = new TreeSet<Object>(Comparator c);



	}

}
