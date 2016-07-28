package learningCollections;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PropertiesExample1 {

	public static void main(String[] args) throws IOException{
		// TODO Auto-generated method stub

		/*Properties prop=new Properties();
		prop.setProperty("project-name", "learningProperties");
		FileWriter writer=new FileWriter("Simple.properties");
		prop.store(writer,"Author:Nirupa");
		writer.close();
		System.out.println("hi");*/
		
		 FileReader reader=new FileReader("Config.properties");  
	      
		    Properties p=new Properties();  
		    p.load(reader);  
		      
		    System.out.println(p.getProperty("user"));  
		    System.out.println(p.getProperty("password"));  
		
		   
		    
		    
	}

}
