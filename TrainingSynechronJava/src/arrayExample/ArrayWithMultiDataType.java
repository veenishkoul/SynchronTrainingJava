package arrayExample;

public class ArrayWithMultiDataType {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Object obj[] = {"Bombay", true,23,31.22};
		System.out.println("Size :" + obj.length);

		for(Object x :obj){
			System.out.println(x);
		}

	}

}
