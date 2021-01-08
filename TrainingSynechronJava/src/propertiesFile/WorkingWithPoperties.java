package propertiesFile;

import java.io.FileInputStream;
import java.util.Properties;

public class WorkingWithPoperties {

	public static void main(String[] args) throws Throwable, Throwable {
		// TODO Auto-generated method stub

		Properties prop = new Properties();

		prop.load(new FileInputStream("C:\\Program Files\\Java\\jdk1.8.0_121\\git\\SynchronTrainingJava\\TrainingSynechronJava\\src\\propertiesFile\\Global.properties"));

		System.out.println(prop.getProperty("Browsertype"));
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("TestEnv"));

	}

}
