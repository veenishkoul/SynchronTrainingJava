package collectionAPIsExamples;

import java.util.ArrayList;

public class OneMoreArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Object> ar1 = new ArrayList<Object>();

		for(int i=10;i<=100;i=i+10){
			ar1.add(i);
		}

		System.out.println(ar1);
		ar1.add(2,29);
		System.out.println(ar1);
		ar1.remove(2);
		System.out.println(ar1);


		ArrayList<Object> ar2 = new ArrayList<Object>();
		ar2.add(11);
		ar2.add(12);
		ar2.add(13);

		ar1.addAll(ar2);
		System.out.println(ar1);
		ar1.add(2,ar2);
		System.out.println(ar1);

		ar1.set(1,222);
		System.out.println(ar1);



	}

}
