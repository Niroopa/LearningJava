package learningCollections;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class CreateProperties {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		prop.setProperty("username", "Pradeep");
		prop.setProperty("password", "23456");
		
		prop.store(new FileWriter("C:\\Users\\niroopa\\Downloads\\Interviews\\info.properties"),"Javaproperties Example");

	}

}
