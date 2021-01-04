package flowControlStatements;

import java.util.Scanner;

public class IfelseControlStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//	int marks;
		Scanner s = new Scanner(System.in);
		int marks = s.nextInt();
		if(marks<=30){
			System.out.println("Fail");
		} else if(marks<=50){
			System.out.println("Pass");
		} else if(marks<=60){
			System.out.println("second class");
		} else if(marks<=70){
			System.out.println("First Class");
		} else  {
			System.out.println("Distinction");
		}
		s.close();
	}

}
