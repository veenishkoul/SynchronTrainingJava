package typeCasting;

public class TypeCastingExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*		byte b = 22;
		int i = b;
		float f = b;
		long l = b;

		System.out.println(b);
		System.out.println(i);
		System.out.println(f);
		System.out.println(l);*/


/*		int i = 130;
		byte b = (byte)i;
		System.out.println("Interger to byte =" + i);*/

		int i = 65;
		char c=(char) i;
		System.out.println(c);

		for(int m=65;m<90;m++){
			char n = (char)m;
			System.out.print(n + " ");
		}
		System.out.println(" ");
		float f = 23.55f;
		int t = (int)f;
		System.out.println(t);
	}

}
