package learningCollections;

import java.util.ArrayList;

public class ArrayListProg {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ArrayListProg.addToList();
    
	}
	
	static void addToList()
	{
		ArrayList list=new ArrayList();
		System.out.println("ArrayList holds duplicate values and maintains insertion order");
		list.add("Bojji");
		list.add("bojji");
		//list.add("100");   // this way of declaring primary datatype is not accepted in collections 
		list.add("innovapath");
		
		list.add(Integer.valueOf("100"));
		
		accessElements(list);
		list.remove(2);
		System.out.println(" ");
		System.out.println("Printing the list with a removed element");
		System.out.println("Printing size of the list:"+list.size());
		
		accessElements(list);
		
		
	}

	
	static void accessElements(ArrayList list)
	{
		for(Object obj:list)
		{
			System.out.println("Elements in list:"+obj);
		}
	}
}
