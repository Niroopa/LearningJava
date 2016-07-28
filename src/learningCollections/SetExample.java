package learningCollections;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample {

	public static void main(String[] args) {
	
		
		SetExample.createSet();
		System.out.println("--------------------------");
		SetExample.removeArray();

	}
	
	static void createSet()
	{
		HashSet<String> mySet=new HashSet<String>();
		System.out.println("Set Doesnt not hold duplicate values");
		mySet.add("This");
		mySet.add("This");
		mySet.add("is");
		mySet.add("Niroopa");
		mySet.add("Tamiri");
		mySet.add("set");
		mySet.add("set");
		mySet.add("Program");
		System.out.println("Set doesnt follow insertion order...prints random output");
		acessElements(mySet);
	}

	static void acessElements(HashSet<String> set)
	{
		Iterator itr=set.iterator();
		while(itr.hasNext())
		{

			System.out.println("Elements in a set:"+itr.next());
			
		}
		
		}
	
	//removing duplicate elements 
    static void removeArray()
    {
    	int arr[]={10,10,15,20,30,65,65,10};
    	int count=0;
    	HashSet<Integer> set=new HashSet<Integer>();
    	
    	//iterating the array in a loop and adding to the set to remove dulpicate elements.
    	for(int i=0;i<arr.length;i++)
    	{
    		
    		System.out.println("num added to set:"+arr[i]);
    		set.add(arr[i]);
    	}
    	
    	//this for loop is for accessing,removing and printing elements in the set
    	for(Integer integer:set)
    	{  
    		System.out.println(" ");
    		System.out.println("duplicate elements removed:"+integer);
            System.out.println(set.size())	;
    		}
    	
    	
    		
    }
}
