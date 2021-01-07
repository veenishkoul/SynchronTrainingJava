package collectionAPIsExamples;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Iterator;
import java.util.RandomAccess;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		HashSet<Object> s = new HashSet<Object>();
		s.add("A");
		s.add("B");
		s.add("C");
		s.add("D");
		s.add("E");
		s.add("B");
		s.add("A");

		System.out.println("size= " + s.size());
		System.out.println(s);

		/*
		 * for(Object x:s){ System.out.println(x); }
		 */
		Iterator<Object> It = s.iterator();
		while (It.hasNext()) {
			System.out.println(It.next());
		}

		System.out.println(s instanceof Serializable);
		System.out.println(s instanceof Cloneable);
		System.out.println(s instanceof RandomAccess);

	}

}
