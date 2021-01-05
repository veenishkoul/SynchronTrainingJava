package inheritenceExample;

//this is child or subclass
public class BMW extends Car {

	public BMW() {
		super.model = "Maruti";
		// super("SKODA");
		Car c = new Car(super.model);
		System.out.println(c.model);

		System.out.println("This is a BMW Constructor");
	}

	public void Start() {
		System.out.println("Start the BMW...");
	}

	public void AntiThreft() {
		System.out.println("This is anti theft feature in the BMW car");
	}

}
