package learningCollections;

import java.util.Comparator;

public class RollnoComparator implements Comparator<Employees>{  
	public int compare(Employees e1,Employees e2){  
		if(e1.empno==e2.empno)  
		return 0;  
		else if(e1.empno>e2.empno)  
		return 1;  
		else  
		return -1;  
		}  

}
