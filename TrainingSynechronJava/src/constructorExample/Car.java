package constructorExample;

public class Car {
    //Default Constructor
	public Car(){
		System.out.println("Car Constructor");
	}
	//parameterized Constructor
	public Car(String model){
		System.out.println("model of the car is : "+ model);
	}

	public Car(int price){
		this("SKODA");
		System.out.println("price of the car is : "+ price);
	}

	public Car(Object price){
		System.out.println("model of the car is : "+ price);
	}

	public Car(String model,int price){
		System.out.println("model of the car is : "+ model + " and price of the car :"+ price);
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	new Car("BMW");
		new Car(20000);
	//	new Car("SKODA",15000);
	}

}


//Rule1: constructor should not be static
//Rule2: constructor should not have a return type