package fileSystemObject;

import java.io.FileReader;
import com.opencsv.CSVReader;

public class WorkWithCSVFile {

	public static void main(String[] args) throws Throwable {

		CSVReader reader = new CSVReader(new FileReader(".\\Files\\TestDataForCSV.csv"));
		java.util.List<String[]> li = reader.readAll();

		System.out.println("Row count =" + li.size());

		String[] str = li.get(0);
		System.out.println("col count =" + str.length);

		for (int i = 0; i < li.size(); i++) {
			String[] str1 = li.get(i);
			for (int j = 0; j < str1.length; j++) {
				System.out.println(str1[j]);
			}
		}
		reader.close();
	}

}
