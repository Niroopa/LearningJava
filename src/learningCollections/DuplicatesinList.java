package learningCollections;

import java.util.ArrayList;
import java.util.Collections;

public class DuplicatesinList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
		int temp = 0;
		//int c;
		ArrayList<Integer> list=new ArrayList<>();
		list.add(10);
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(20);
		list.add(31);
		list.add(32);
		list.add(31);
		
		ArrayList<Integer> index=new ArrayList<>();
		
		System.out.println("elements before removing duplicates:"+list);
		System.out.println("elements before removing duplicates:"+list.size());
		Integer k=0;
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{   
					k=list.get(j);
					
					System.out.println("Printing duplicate values:"  + k +  "index "  +  j);
					
					index.add(j);			
				}
			
			}
			
		}
//		Collections.sort(index);
		for(int i=index.size()-1;i>=0; i--)
		{
			temp = index.get(i);
			System.out.println(temp);
			list.remove(temp);
		}
	
		System.out.println(" ");
		System.out.println("list after removing duplicates"+list);

        System.out.println(" ");		
		System.out.println("list size after removing duplicates   :"  +list.size());
	}


}
	
