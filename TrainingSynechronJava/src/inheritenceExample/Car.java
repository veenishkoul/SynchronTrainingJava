package inheritenceExample;

//this is parent class or superclass
public class Car {
	String model;

	public Car() {
		System.out.println("This is a Car Constructor");
	}

	// Parameterized constructor
	public Car(String Model) {
		System.out.println("This is a paramaterized parent class Constructor " + Model);
	}

	public void Start() {
		System.out.println("Start the car...");
	}

	public void Stop() {
		System.out.println("Stop the car");
	}
}
