package fileSystemObject;

import java.util.StringTokenizer;

public class StringTokenizerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Bangalore is too cold today";
		StringTokenizer st = new StringTokenizer(str);

		//StringTokenizer st = new StringTokenizer(str,"a");
		//StringTokenizer st = new StringTokenizer(str,"a",true);

		while(st.hasMoreTokens()){
			System.out.println(st.nextToken());
		}


	}

}
