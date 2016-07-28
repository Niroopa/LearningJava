package learningCollections;

import java.util.ArrayList;
import java.util.Collections;

public class GenericComparator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Employees> al=new ArrayList<Employees>();  
		al.add(new Employees(101,"Vijay",29000));  
		al.add(new Employees(106,"Ajay",78000));  
		al.add(new Employees(105,"Jai",20001));  
		  
		System.out.println("Sorting by Name...");  
		  
		Collections.sort(al,new NameComparator());  
		for(Employees emp: al){  
		System.out.println(emp.empno+" "+emp.name+" "+emp.salary);  
		}  
		  
		System.out.println("sorting by age...");  
		  
		Collections.sort(al,new RollnoComparator());  
		for(Employees emp: al){  
		System.out.println(emp.empno+" "+emp.name+" "+emp.salary);  
		}  
		  
		}

	}


