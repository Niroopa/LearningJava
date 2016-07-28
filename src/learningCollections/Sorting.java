package learningCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.ListIterator;

public class Sorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     Sorting.addToList();
     System.out.println("------------------------");
    
	}
	
	static void addToList()
	{
		ArrayList<String>  list=new ArrayList<String>();
		list.add("Hello");
		list.add("World");
		list.add("Welcome");
		list.add("Nirupa");
		System.out.println("------------------------");
		accessElements(list);
		System.out.println("------------------------");
		sortList(list);
		System.out.println("------------------------");
		shuffleList(list);
	}
  
	static void accessElements(ArrayList<String> list)
	{
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println("The elements in list:"+itr.next());
		}
		
		ListIterator<String> itr1=list.listIterator(); 
		while(itr1.hasPrevious())
		{
			System.out.println("The elements in previous direction:"+itr1.previous());
		}
	}
	
	static void sortList(ArrayList<String> mylist)
	{
		Collections.sort(mylist);
		accessElements(mylist);
		
	}
	
	static void shuffleList(ArrayList<String> mylist)
	{
		Collections.shuffle(mylist);
		accessElements(mylist);
	}
	
	
}
