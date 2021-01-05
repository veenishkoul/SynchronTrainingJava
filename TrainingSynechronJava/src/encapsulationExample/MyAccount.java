package encapsulationExample;

public class MyAccount {

	private String fname;
	private String lname;
	private int AccountNum;

	public String getFname() {
		if(fname.equals("Veenish")){
			System.out.println("valid first name");
		} else {
			System.out.println("Invalid first name");
		}
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getLname() {
		if(lname.equals("Koul")){
			System.out.println("valid last name");
		} else {
			System.out.println("Invalid last name");
		}
		return lname;
	}

	public void setLname(String lname) {
		this.lname = lname;
	}

	public int getAccountNum() {
		if(AccountNum == 12345){
			System.out.println("valid Account number");
		} else {
			System.out.println("Invalid Account number");
		}
		return AccountNum;
	}

	public void setAccountNum(int accountNum) {
		AccountNum = accountNum;
	}

}
