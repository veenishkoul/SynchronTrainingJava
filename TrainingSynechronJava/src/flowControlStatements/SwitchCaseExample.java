package flowControlStatements;

import java.util.Scanner;

public class SwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner s = new Scanner(System.in);
		int x = s.nextInt();
	//	int x = 4;
		switch(x){
		case 1:
			System.out.println("case 1");
			break;
		case 2:
			System.out.println("case 2");
			break;
		case 3:
			System.out.println("case 3");
			break;
		default:
			System.out.println("Default value");
		}
		s.close();
	}

}
