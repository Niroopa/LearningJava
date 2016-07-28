package learningCollections;

import java.util.ArrayList;

public class Exam3 {

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
		
		for(int i=0;i<list.size();i++)
		{
			for(int j=i+1;j<list.size();j++)
			{
				if(list.get(i).equals(list.get(j)))
				{   
					/*if( count == 0)
					{	
						System.out.println("  ");
						System.out.print("index of duplicate elements: ");
					}
						*/	
					
					System.out.println(j+" ");
					count=count+1;
					
					list.remove(j);
					System.out.println("list after elemrnt removed:"+list);
 					
					
				}
			}
		}
		System.out.println(" ");
	System.out.println("duplicate num count:"+count);
	
System.out.println("List after removing the duplicates:"+list);


	}

	}




