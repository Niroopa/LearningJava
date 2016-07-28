package learningCollections;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    MapExample.createMap();
    
   }

	
	static void createMap()

	{
		HashMap<Integer,String> myMap=new HashMap<>();
		System.out.println(" HashMap Holds only unique values ");
		myMap.put(100,"Paul");
		myMap.put(101,"John");
		myMap.put(102,"Larry");
		myMap.put(103,"Harry");
		myMap.put(104,"Tom");
		myMap.put(105,"Clooney");
		keyValuesOnly(myMap);
		System.out.println("  ");
		valuesOnly(myMap);
		System.out.println("  ");
		
		//Entry allows to fetch the elements in a map i.e the key and value pair 
		//Every hashmap has a function called entryset() which returns the object of entry and this 
		//object allows us to access the value in the netry class.
		
		for(Map.Entry map:myMap.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
		//printing only key from map
		
		
	}
	
	static void keyValuesOnly(HashMap<Integer,String> myMap)
	{
		 Set<Integer> mySet=myMap.keySet();
			for(Integer integer:mySet)
			{
				System.out.println("Printing all key values:"+integer);
			}
	}
	
	static void valuesOnly(HashMap<Integer,String> Map)
	{
		Collection<String> myVal=Map.values();
		for(String string:myVal)
		{
			System.out.println("Printing all values of the key:"+string);
		}
	}
	
}
