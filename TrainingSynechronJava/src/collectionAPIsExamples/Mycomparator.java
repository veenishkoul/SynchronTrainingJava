package collectionAPIsExamples;

import java.util.Comparator;

public class Mycomparator implements Comparator<Object> {

	public int compare(Object Obj1, Object Obj2){
		Integer I1 = (Integer) Obj1;
		Integer I2 = (Integer) Obj2;

		if(I1 < I2) {
			return +1;
		}else if(I1 > I2){
			return -1;
		} else
			return 0;
	//	return I1.compareTo(I2);
	//	return  I2.compareTo(I1);
	//	return +1;
	//	return -1;
	//	return 0;
	}

}
