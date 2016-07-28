package learningCollections;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentArraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s1=new Student(10,"NIrupa","tamiri");
		Student s2=new Student(20,"Pradeep","Mallada");
		Student s3=new Student(30,"John","Satyamurthy");
		
		
	//adding student details to arraylist
		ArrayList<Student> al=new ArrayList<>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		Iterator itr=al.iterator();
		while(itr.hasNext())
		{
			Student st=(Student)itr.next();
			System.out.println(st.rollno+" "+st.fname+" "+st.lname);
		}
	}

}
