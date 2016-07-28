package learningCollections;

import java.util.ArrayList;

public class Exam2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(20);
		list.add(31);
		list.add(32);
		list.add(31);
		
		System.out.println("elements before removing duplicates:"+list);
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{
					list.remove(j);
					
				}
			}
		}
		
System.out.println("List after removing the duplicates:"+list);

	}

}
