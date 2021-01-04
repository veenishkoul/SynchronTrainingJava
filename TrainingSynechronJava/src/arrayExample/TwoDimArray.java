package arrayExample;

public class TwoDimArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object obj[][] = new Object[3][2];

		obj[0][0] = "Name1";
		obj[0][1]=	"pwd1";

		obj[1][0] = "Name2";
		obj[1][1]=	"pwd2";

		obj[2][0] = "Name3";
		obj[2][1]=	"pwd3";

		System.out.println("row count =" + obj.length);
		System.out.println("column count =" + obj[1].length);

/*
		for(int i=0;i<obj.length;i++){
			for(int j=0;j<obj[0].length;j++){
				System.out.println(obj[i][j]);
			}
		}*/

		for(Object[] x:obj){
			for(Object y:x){
				System.out.println(y);
			}
		}

	}

}
