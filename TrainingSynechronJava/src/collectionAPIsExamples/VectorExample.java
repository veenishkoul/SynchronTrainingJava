package collectionAPIsExamples;

import java.io.Serializable;
import java.util.RandomAccess;
import java.util.Vector;

public class VectorExample {

	public static void main(String[] args) {

		Vector<Object> v = new Vector<Object>();

	//Vector<Object> v = new Vector<Object>(10,2);
	//Vector<Object> v = new Vector<Object>(int initial capacity int incremental capacity);


		v.add("A");
		v.add("B");
		v.add("c");
		v.add(24);
		v.add("Teams");

		System.out.println(v.size());
		System.out.println(v.indexOf(5));

		// normal for loop
		// for each loop
		// Iterator
		// v.listiterator

		System.out.println(v.capacity());
		// initial capacity = 10
		// new capacity = current capacity * 2

		System.out.println(v.firstElement());
		System.out.println(v.lastElement());

		// synchronous(Thread safety)

		//initial
		//Vector<Object> v = new Vector<Object>(Collection c);

/*		ArrayList<Object> ar = new ArrayList<Object>();
		 ar.add("A");
		 ar.add("B");
		Vector<Object> v1 = new Vector<Object>(ar);
		System.out.println(v1);*/

		System.out.println(v instanceof Serializable);
		System.out.println(v instanceof Cloneable);
		System.out.println(v instanceof RandomAccess);

	}


}
