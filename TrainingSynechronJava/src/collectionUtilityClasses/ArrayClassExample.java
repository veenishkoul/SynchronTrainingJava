package collectionUtilityClasses;


import java.util.Arrays;
import java.util.List;

import collectionAPIsExamples.Mycomparator;

public class ArrayClassExample {

	public static void main(String[] args) {


		String str[] = {"A","B","C"};

//		List<String> li = new Arrays.asList(str);
//		System.out.println(li);

		List<String> li = Arrays.asList(str);
		System.out.println(li);

		//li.add("M");
		li.set(1, "K");
		System.out.println(li);
/*//		int i[] = { 10, 3, 2, 5, 8, 4 };
		 integer i[] = {10,3,2,5,8,4};
		Arrays.sort(i);

		Arrays.sort(i, new Mycomparator());
		for( int x:i){
			System.out.println(x	);
		}

	//	int br = Arrays.binarySearch(i,5);
	//	int br = Arrays.binarySearch(i,7);

		System.out.println(br);*/
	}

}
