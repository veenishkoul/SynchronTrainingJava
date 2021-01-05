package encapsulationExample;

public class User1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MyAccount acc = new MyAccount();

		acc.setFname("Veenish");
		acc.setLname("Koul");
		acc.setAccountNum(12345);

		System.out.println("First name: "+acc.getFname());
		System.out.println("Last name: "+acc.getLname());
		System.out.println("Account num: "+acc.getAccountNum());

	}

}
