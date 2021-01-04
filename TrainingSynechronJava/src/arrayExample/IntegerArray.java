package arrayExample;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] i = new int[6];
		i[0] = 23;
		i[1] = 25;
		i[2] = 26;
		i[3] = 27;
		i[4] = 28;
		i[5] = 29;

	System.out.println("lenght of array :" +i.length);

	for(int j = 0;j<i.length;j++){
		System.out.print(i[j]);
	}
    System.out.println();
	for(int x : i){
		System.out.println(x);
	}


	}

}
