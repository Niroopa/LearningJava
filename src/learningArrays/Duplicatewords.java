package learningArrays;

/*.Write a java program to find the duplicate words(irrespective of case) 
 * and their number of occurrences in a sentence?
 */

public class Duplicatewords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s="The sun rises in the East";
		String str[]=s.split(" ");

		int count =0;
		
		for(int i=0;i<str.length;i++)

		{
			for(int j=i+1;j<str.length;j++)
			{
						

				if(str[i].equalsIgnoreCase(str[j]))
				{
					System.out.println("duplicate word is :"+str[i]);					
					count=count+1;
				}
			}
		}
		System.out.println(count);
	}

}
