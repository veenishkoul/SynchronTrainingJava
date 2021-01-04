package arrayExample;

public class StringArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str[] = {"B","C","D","F"};
		System.out.println("Array lenght "+str.length);

		for(int i=0;i<str.length;i++){
			System.out.print(str[i]);
		}

		System.out.println();

		for(String x: str){
			System.out.print(x);
		}

	}

}
