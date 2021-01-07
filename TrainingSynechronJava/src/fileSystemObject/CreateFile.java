package fileSystemObject;

import java.io.File;

public class CreateFile {

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub
	//	File f = new File("C:\\Users\\EshaVeenish\\Desktop\\Veenish\\JavaCode\\synechron\\Files\\Test.txt");
	//	File f = new File("C:\\Users\\EshaVeenish\\Desktop\\Veenish\\JavaCode\\synechron\\Files\\Test.xls");
		File f = new File("C:\\Users\\EshaVeenish\\Desktop\\Veenish\\JavaCode\\synechron\\Files\\Test.pdf");
		f.createNewFile();
		System.out.println("Done");
	}

}
