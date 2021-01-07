package collectionAPIsExamples;

import java.util.TreeSet;

public class TreeSetExampleWithDescendingOrder {

	public static void main(String[] args) {

		TreeSet<Integer> t = new TreeSet<Integer>(new Mycomparator());
		t.add(4);
		t.add(3);
		t.add(0);
		t.add(2);
		t.add(2);
		t.add(7);

		System.out.println(t);

	}

}

//hot key for importing packages -> ctrl + shift + O


//Constructor

//1. TreeSet<Integer> t = new TreeSet<Integer>();
//2. TreeSet<Integer> t = new TreeSet<Integer>(comparator c);
//3. TreeSet<Integer> t = new TreeSet<Integer>(collect c);
//4. TreeSet<Integer> t = new TreeSet<Integer>(SortedSet s);