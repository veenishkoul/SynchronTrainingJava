package com.synechronTraining;

public class StringMathods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Bangalore is 900 km far from Pune";
		int length = str.length();
		System.out.println(length);
		System.out.println("-------------------------");
		System.out.println(str.isEmpty());
		System.out.println("-------------------------");
		System.out.println(str.equals("Bangalore is 900 km far from Pune"));
		System.out.println("-------------------------");
		System.out.println(str.contains("9"));
		System.out.println("-------------------------");
		String[] split =str.split(" ");
		for(String x : split){
			System.out.println(x);
		}
		System.out.println("-------------------------");
		String join = String.join(" ", split);
		System.out.println(join);

	    System.out.println("A".compareTo("B"));
	    System.out.println("Z".compareTo("M"));
	    System.out.println("Z".compareTo("Z"));

	    //str.compareTo(anotherString)
}

}
