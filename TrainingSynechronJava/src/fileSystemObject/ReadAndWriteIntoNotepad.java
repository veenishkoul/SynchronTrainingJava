package fileSystemObject;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadAndWriteIntoNotepad {

	static FileInputStream fi;
	static FileOutputStream fo;

	public static void main(String[] args) throws Throwable {
		// Same code can be used for creating any type of file
		long start = System.currentTimeMillis();
		try {
			fi = new FileInputStream(".\\Files\\CoreJava_Training_Topics.txt");
			fo = new FileOutputStream(".\\Files\\CoreJava_Training_Topics_copy.txt");

			int data;
			while ((data = fi.read()) != -1) {
				fo.write(data);
			}
		} catch (Throwable t) {

		} finally {
			fi.close();
			fo.close();
			System.out.println("Done");
		}
		long stop = System.currentTimeMillis();
		System.out.println("Total Time Taken = "+(stop-start));
	}
}
