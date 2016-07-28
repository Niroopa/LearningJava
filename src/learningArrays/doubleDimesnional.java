package learningArrays;

public class doubleDimesnional {
	
	public static void main(String[] args)
	{
		
		int studentsmarks[][]; //declared an array
		studentsmarks=new int[3][3]; //allocating memory for the array 
		

		studentsmarks[0][0]=45;
		studentsmarks[0][1]=55;
		studentsmarks[0][2]=75;
		studentsmarks[1][0]=65;
		studentsmarks[1][1]=15;
		studentsmarks[1][2]=25;
		studentsmarks[2][0]=20;
		studentsmarks[2][1]=96;
		studentsmarks[2][2]=78;
		
		for(int i=0;i<studentsmarks.length;i++)
		{
			for(int j=0;j<studentsmarks[i].length;j++)
				{
			      System.out.println("Std marks:"+studentsmarks[i][j]);
				}
		}
		
		
		
		
	}

}
