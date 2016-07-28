package learningCollections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample {
	
	public static void main(String[] args)
	{
		LinkedList<String> list=new LinkedList<>();
		list.add("this is");
		list.add("Linked");
		list.add("List");
		list.add("Example");
		
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
	}

}
