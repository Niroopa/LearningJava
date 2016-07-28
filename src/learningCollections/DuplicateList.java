package learningCollections;

import java.util.ArrayList;

public class DuplicateList {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count =0;
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
					
									
				}
			
			}
			
		}
		for(int l=0;l<list.size();l++)
		{
			for(int m=l+1;m<list.size();m++)
			{
				if(list.get(l).equals(list.get(m)))
				{
					count=count+1;
					//System.out.println("list size  :"+list.size());
					list.remove(m);
					//System.out.println("list after removing every duplicates  " +list.size());
					
				}
			}
		}
		System.out.println(" ");
		System.out.println("list after removing duplicates"+list);
		System.out.println("Duplicate Count :"+count);
        System.out.println(" ");		
		System.out.println("list size after removing duplicates   :"  +list.size());
	}


}
