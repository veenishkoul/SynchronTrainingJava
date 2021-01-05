package com.TestForPackage;

import userDefinedFunctions.Test1;

//import com.synechronTraining.Car;

//import inheritenceExample.Car;

public class TestForPackage extends Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// new Car();
		// Test1.login();
//		login();
		Test1 t=new Test1();
		t.login();
		new Test1().login();
	}

}
