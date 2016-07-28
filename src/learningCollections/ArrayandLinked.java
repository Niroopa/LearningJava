package learningCollections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class ArrayandLinked {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<String> l=new ArrayList<>();
			l.add("hi");
			l.add("world");
			
			
		List<String> al=new LinkedList<>();
		al.add("NIrupa");
		al.add("Tamiri");
		al.add("Bojji");
		al.add("bujji");
		
		System.out.println("printing element at second position:"+al.get(2));
		System.out.println("arraylist:"+l);
		System.out.println("linkedlist:"+al);
		
		
		
		ListIterator<String> itr=al.listIterator();
		System.out.println("traversing elements in forward direction");
         while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
         
         System.out.println("traversing elements in reverse/backward direction");
         while(itr.hasPrevious())
         {
        	 System.out.println(itr.previous());
         }
        	 
		}

}
