package fileSystemObject;

import java.io.FileInputStream;

public class ReadDataFromNotepadAndWriteToConsole {

	static FileInputStream fp;

	public static void main(String[] args) throws Throwable {
		// TODO Auto-generated method stub

		try {
			fp = new FileInputStream(".\\Files\\CoreJava_Training_Topics.txt");
			int data;
			while ((data = fp.read()) != -1) {
				System.out.print((char) data);
			}
		} catch (Throwable t) {

		} finally {
			fp.close();
		}

	}

}
