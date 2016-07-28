package learningCollections;

import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class SystemProps {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    Properties prop=System.getProperties();
    Set set=prop.entrySet();
    
    Iterator itr=set.iterator();
    while(itr.hasNext())
    {
    	Map.Entry entry=(Map.Entry)itr.next();
    	System.out.println(entry.getKey()+" "+entry.getValue());
    }
	}

}
