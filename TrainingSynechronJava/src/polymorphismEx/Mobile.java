package polymorphismEx;

public class Mobile {

	// polymorphism
	// default method
	public void Open() {
		System.out.println("No Password...");
	}

	public void Open(String pwd) {
		System.out.println("Opened the mobile with String Password..." + pwd);
	}

	public void Open(int pwd) {
		System.out.println("Opened the mobile with Interger Password..." + pwd);
	}

	public void Open(String pwd, int p) {
		System.out.println("Opened the mobile with String Password..." + pwd + " and int pwd  " + p);
	}

	public void Open(Object pwd) {
		System.out.println("Opened the mobile with Object Password..." + pwd);
	}

	public static void main(String[] args) {
		Mobile m = new Mobile();
		m.Open("1234");

	}

}

// method overloading - Redesigning method with the same name
// and different parameters data type and number of parameters we called as
// method overloading
