package learningCollections;

public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int i=0,j=0;
		for( i=0;i<5;i++)
		{			
		 for( j=1;j<i;j++)
		  {
			System.out.print(j);
	      	}		
		 System.out.println();
			
	      }
		
		for(;i>0;i--)//subtract one from i each time the loop
		{
			for(j=1;j<=i;j++)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		

	}
}