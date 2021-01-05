package userDefinedFunctions;

public class Add2Numbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10, b = 20;
		System.out.println("A");
		int c = sum(a, b) + 50;
		System.out.println("Total sum :" + c);
		System.out.println("B");

	}

	public static int sum(int a, int b) {
		// TODO Auto-generated method stub
		return a + b;
	}

}
