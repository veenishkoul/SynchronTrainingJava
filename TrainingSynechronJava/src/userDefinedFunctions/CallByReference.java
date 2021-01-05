package userDefinedFunctions;

public class CallByReference {

	int x = 10;
	int y = 20;

	public void swap(CallByReference cbr) {
		int temp;
		temp = cbr.x;
		cbr.x = cbr.y;
		cbr.y = temp;

	}

	public static void main(String[] args) {

		CallByReference cbr = new CallByReference();
		System.out.println("Example for Call By Reference");
		System.out.println("Print before swap x=" + cbr.x + " y=" + cbr.y);
		cbr.swap(cbr);
		System.out.println("Print after swap x=" + cbr.x + " y=" + cbr.y);

	}

}
