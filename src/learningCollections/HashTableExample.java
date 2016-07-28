package learningCollections;

import java.util.Hashtable;
import java.util.Map;

public class HashTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*A Hashtable is an array of list.Each list is known as a bucket.
		 * The position of bucket is identified by calling the hashcode() method.
		 * A Hashtable contains values based on the key. 
		 * It implements the Map interface and extends Dictionary class.
		It contains only unique elements.
		It may have not have any null key or value.
		It is synchronized.*/
		
		
		Hashtable<Integer,String> hm=new Hashtable<>();
		hm.put(10, "nirupa");
		hm.put(20,"pradeep");
		hm.put(30,"bujji");
		hm.put(40,"bojji");
		
		for(Map.Entry map:hm.entrySet())
		{
			System.out.println(map.getKey()+" "+map.getValue());
		}
		
	}

}
