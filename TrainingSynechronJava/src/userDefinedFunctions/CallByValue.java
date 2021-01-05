package userDefinedFunctions;

public class CallByValue {

	int x = 10;
	int y = 20;

	public void swap(int a, int b) {
		// TODO Auto-generated method stub
		int temp;
		temp = a;
		a = b;
		b = temp;

	}

	public static void main(String[] args) {

		CallByValue cbv = new CallByValue();
		System.out.println("Example for Call By Value");
		System.out.println("Print before swap x=" + cbv.x + " y=" + cbv.y);
		cbv.swap(cbv.x, cbv.y);
		System.out.println("Print after swap x=" + cbv.x + " y=" + cbv.y);

	}

}
