package fileSystemObject;

import java.io.FileReader;
import java.io.FileWriter;

public class FileReaderWriteClassDemo {

	static FileReader fi;
	static FileWriter fo;
	public static void main(String[] args) throws Throwable {
	// Same code can be used for creating any type of file
	long start = System.currentTimeMillis();
	try {
		fi = new FileReader(".\\Files\\CoreJava_Training_Topics.txt");
		fo = new FileWriter(".\\Files\\CoreJava_Training_Topics_copy_2.txt");

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
