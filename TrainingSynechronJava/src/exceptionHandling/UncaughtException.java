package exceptionHandling;

public class UncaughtException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("A");
		try{
			System.out.println(8/0);
			System.out.println("try...block");
		}catch(Throwable t){
			System.out.println(t.getMessage());
			System.out.println("catch...block");
		}
		System.out.println("B");
	}

}
