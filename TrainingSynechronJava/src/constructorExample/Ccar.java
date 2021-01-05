package constructorExample;

public class Ccar {

	String model;
	int price;

	public Ccar(String model,int price){
		this.model = model;
		this.price = price;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Ccar c=new Ccar("BMW",20000);
		System.out.println(c.model);
		System.out.println(c.price);
/*		Ccar("BMW",20000);
		Ccar("Skoda",15000);
		Ccar("Maruti",5000);*/
	}

}

//this refers to the current object