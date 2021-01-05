package collectionAPIsExamples;

import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample {


	public static void main(String[] args) {

		ArrayList<String> ar = new ArrayList<String>();

		ar.add("A");
		ar.add("B");
		ar.add("C");
		ar.add("D");
		ar.add("E");

		System.out.println("Size = " + ar.size());

	//	 for(String x:ar){ System.out.println(x); }

	//	  Iterator<String> it1 = ar.iterator(); while(it1.hasNext()){
	//	  System.out.println(it1.next()); }

		System.out.println("-----------------");
		ListIterator<String> lt = ar.listIterator();
		System.out.println(lt.next());
		System.out.println(lt.next());
		System.out.println(lt.previous());
		System.out.println(lt.previous());

/*		Iterator<String> it = ar.iterator();
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());
		System.out.println(it.next());*/

	}
}
