package learningCollections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

public class ComparatorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList al=new ArrayList();  
		al.add(new Employees(101,"Vijay",23000));  
		al.add(new Employees(106,"Ajay",27500));  
		al.add(new Employees(108,"Jai",19000));  
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al,new NameComparision());  
		Iterator itr=al.iterator();  
		while(itr.hasNext()){  
		Employees emp=(Employees)itr.next();  
		System.out.println(emp.empno+" "+emp.name+" "+emp.salary);  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new AgeComparision());  
		Iterator itr2=al.iterator();  
		while(itr2.hasNext()){  
		Employees emp=(Employees)itr2.next();  
		System.out.println(emp.empno+" "+emp.name+" "+emp.salary); 
		}  
	}

}
