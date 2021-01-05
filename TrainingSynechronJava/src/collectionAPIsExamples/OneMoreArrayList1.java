package collectionAPIsExamples;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.RandomAccess;

public class OneMoreArrayList1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Object> ar1 = new ArrayList<Object>(5);

		ar1.add("B");
		ar1.add("A");
		ar1.add("C");

		ArrayList<Object> ar2 = new ArrayList<Object>(ar1);

		ar2.add("P");

		System.out.println(ar2);
		System.out.println(ar2 instanceof Serializable);
		System.out.println(ar2 instanceof Cloneable);
		System.out.println(ar2 instanceof RandomAccess);

	}

}
