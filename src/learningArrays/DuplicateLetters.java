package learningArrays;

public class DuplicateLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="peep";
		//s.charAt(0);
		int count=0;
//		System.out.println(s.length());
			    
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
			
		     if(s.charAt(i) == s.charAt(j))
		       {
			      count++;
		       }
		    }
		}
		System.out.println(count);
		
		
		

	}
}
