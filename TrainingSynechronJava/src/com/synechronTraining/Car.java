package com.synechronTraining;

public class Car {
		// TODO Auto-generated method stub
		String model;
		int price;
		int wheels;

		public static void main(String[] args) {

			Car a = new Car();
			Car b = new Car();
			Car c = new Car();
			a.model="BMW";
			a.price=20000;
			a.wheels =4;
			System.out.println("Model of car is : " + a.model);
			System.out.println("Price of the car is : " + a.price);
			System.out.println("No. of wheels : " + a.wheels);

			b.model="SKODA";
			b.price=10000;
			b.wheels =4;
			System.out.println("Model of car is : " + b.model);
			System.out.println("Price of the car is : " + b.price);
			System.out.println("No. of wheels : " + b.wheels);

			b.model="MARUTI";
			b.price=5000;
			b.wheels =4;
			System.out.println("Model of car is : " + c.model);
			System.out.println("Price of the car is : " + c.price);
			System.out.println("No. of wheels : " + c.wheels);
		}

}
