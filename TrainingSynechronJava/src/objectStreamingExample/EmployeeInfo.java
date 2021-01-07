package objectStreamingExample;

import java.io.Serializable;

public class EmployeeInfo implements Serializable {

	/**
	 *
	 */
	private static final long serialVersionUID = -231790683452491557L;
	int empid;
	String name;
	transient int password;

	public EmployeeInfo(int empid, String name, int password) {

		this.empid = empid;
		this.name = name;
		this.password = password;
	}
}

//marker interface : an interface with abstract methods