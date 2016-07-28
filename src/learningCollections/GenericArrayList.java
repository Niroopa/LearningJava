package learningCollections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class GenericArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ArrayList<String> list=new ArrayList<>();
		list.add("hello");
		list.add("Hello");
		list.add("ArrayList");
		list.add("Programme");
		list.add("Generics");
		list.add("Special");
		
		//using addAll()
		ArrayList<String> al=new ArrayList<>();
		al.add("new");
		al.add("list");
		
		list.addAll(al);
		
		//printing elements using iterator interface
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			System.out.println(" ");
		}
		//elements can also be printed using for each loop.
		
		for(String obj:list)
		{
			System.out.println(obj);
		}
		
	}

}
