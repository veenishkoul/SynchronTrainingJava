package staticExample;

public class TestForStatic {

	String model;
	int price;
	static int wheel = 4;
	public void testFors(){
		System.out.println("Test for Static");
	}
	public static void main(String[] args) {
		// static value printed w/o initiating the class object
		System.out.println("wheels=" +wheel);
		// initiating the class object to print non statics attributes and functions.
		TestForStatic s = new TestForStatic();
		s.testFors();
		System.out.println(s.model);
	}

}
