package exceptionHandling;

public class FinallyExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Open DB");

		try {
			System.out.println(8 / 0);
			System.out.println("execute sql query...");

		} catch (Throwable t) {
			System.out.println(8 / 0);

		} finally {
			System.out.println("Close DB");
		}
	}

}

