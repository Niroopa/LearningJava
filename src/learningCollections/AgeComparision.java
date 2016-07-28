package learningCollections;

import java.util.Comparator;

public class AgeComparision implements Comparator {

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Employees emp1=(Employees)o1;
		Employees emp2=(Employees)o2;
		
		if(emp1.salary==emp2.salary)
		return 0;
		else
			if(emp1.salary>emp2.salary)
				return 1;
			else
				return -1;
	}

	

}
