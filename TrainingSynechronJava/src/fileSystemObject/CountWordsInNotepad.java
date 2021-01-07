package fileSystemObject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.StringTokenizer;

public class CountWordsInNotepad {

	static FileReader fr;
	static StringTokenizer st;
	static BufferedReader br;
	static int count = 0;

	public static void main(String[] args) throws Throwable {

		try {

			fr = new FileReader(".\\Files\\CoreJava_Training_Topics.txt");
			br = new BufferedReader(fr);

			String data;
			while ((data = br.readLine()) != null) {
				String readLine = data;
				st = new StringTokenizer(readLine);
				while (st.hasMoreTokens()) {
					System.out.println(st.nextToken());
					count++;
				}

			}

			System.out.println("Total words =" + count);

		} catch (Throwable t) {

		} finally {
			fr.close();
			br.close();
		}

	}

}
