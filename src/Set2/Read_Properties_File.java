package Set2;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class Read_Properties_File {

	public static void main(String[] args) throws IOException {
		FileReader file=new FileReader("E:\\Interview_Programs\\Interview_Programs\\src\\Set2\\Properties.properties");
		Properties prop=new Properties();
		prop.load(file);
		
		System.out.println(prop.get("name"));
		System.out.println(prop.get("age"));
	}

}
