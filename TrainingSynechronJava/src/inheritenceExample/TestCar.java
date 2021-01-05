package inheritenceExample;

public class TestCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		Car c = new Car();
		c.Start();
		c.Stop();*/
		Car c = new BMW();
	/*//	BMW b = new BMW();
		b.Start();
		b.Stop();
		b.AntiThreft();*/
		c.Start();
		c.Stop();
	//	c.AntiThreft();

		BMW b = new BMW();
		b=(BMW) c;
		b.AntiThreft();


	}

}

//Redefining the method from parent to child with the same name is called as method overriding.
