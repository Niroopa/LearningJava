package learningArrays;

public class AnonymousArray {
	
	public static void main(String[] args)
	{
		//one dimensional anonymous array..
		print(new int[]{10,20,30,40});
		
		System.out.println("  ");
	
		
		//two dimensional anonymous array..we are passing directy as an argument to the method here and not saving it 
		//in any variable..
		print(new int[][]{{10,20},{30,40},{50,60}});
		
	}
	
	
	public static void print(int a[])
	{
		for (int i=0;i<a.length;++i)
		
			System.out.print(a[i]+ " ");
		
		
	}
	
	public static void print(int a[][])
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
		       {
				 System.out.print(a[i][j]+ " ");
				}
			
			System.out.println(" ");
		}
	}
}
