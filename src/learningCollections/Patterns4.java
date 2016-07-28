package learningCollections;

import java.util.ArrayList;

public class Patterns4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list=new ArrayList<>();
		int temp=0;
		int n=4;
		int k=0;
		
		for(int i=1;i<=n;i++)
		{
			list.add(i);
			//System.out.println("print elements in list:"+list);
					}
			
		for(int i=1;i<=n;i++)
		{
			System.out.println("print elements in list:"+list);
			
			temp = list.get(0);			
			for(int j=1;j<n;j++)
			{   
				k=j-1;
				list.set(k,list.get(j));
				System.out.println("print elements in list:--"+list);				
		    }
			k=n-1;
			list.set(k,temp);
			}
		
 		}

	}


