package com.synechronTraining;

public class Ccar {

	String model;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar a = new Ccar();
		Ccar b = new Ccar();
		Ccar c = new Ccar();

		a.model = "BMW";
		b.model ="SKODA";
		c.model = "Maruti";

		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);
		System.out.println("-------");
		a =b;
		b=c;
		c=a;

		System.out.println(a.model);
		System.out.println(b.model);
		System.out.println(c.model);

	}

}
