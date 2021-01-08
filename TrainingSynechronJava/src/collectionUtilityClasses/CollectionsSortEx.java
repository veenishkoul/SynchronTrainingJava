package collectionUtilityClasses;

import java.util.ArrayList;
import java.util.Collections;

import collectionAPIsExamples.Mycomparator;

public class CollectionsSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Integer> ar = new ArrayList<Integer>();
		ar.add(10);
		ar.add(0);
		ar.add(4);
		ar.add(8);

		// binary search
		//before binary search sort the list
		System.out.println(ar);
		Collections.sort(ar);
		int br1 = Collections.binarySearch(ar, 4);
		System.out.println(br1);
		int br = Collections.binarySearch(ar, 15);
		System.out.println(br);
		/*
		 * System.out.println(ar); Collections.sort(ar); System.out.println(ar);
		 * Collections.sort(ar, new Mycomparator()); System.out.println(ar);
		 * Collections.reverse(ar); System.out.println(ar);
		 */
	}

}
