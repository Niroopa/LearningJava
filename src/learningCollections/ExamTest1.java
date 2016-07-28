package learningCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class ExamTest1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> list=new ArrayList<>();
		list.add("Hi");
		list.add("This");
		list.add("is");
		list.add("ArrayList");
		list.add("Program");
		list.add("Sample");
	
		Iterator itr=list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		
		
	}
	

}
