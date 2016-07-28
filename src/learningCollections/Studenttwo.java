package learningCollections;

import java.util.ArrayList;
import java.util.Collections;

public class Studenttwo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Studentone s1=new Studentone(10,"Niroopa",25);
		
    ArrayList<Studentone>  al=new ArrayList<>();
    al.add(new Studentone(260,"niroopa",77));
    al.add(new Studentone(207,"pradeep",10));
    al.add(new Studentone(309,"swetha",69));
    
    
    Collections.sort(al);
    for(Studentone st:al)
    {
    	System.out.println(st.rollno+" "+st.name+" "+st.age);
    }
   
	}

}
