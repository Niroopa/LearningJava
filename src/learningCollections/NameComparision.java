package learningCollections;

import java.util.Comparator;

public class NameComparision implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Employees emp1=(Employees)o1;
		Employees emp2=(Employees)o2;
		
		
		return emp1.name.compareTo(emp2.name);
	}

}
