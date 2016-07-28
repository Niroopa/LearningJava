package learningCollections;

public  class Studentone implements Comparable <Studentone>{

	int rollno;
	int age;
	String name;
	
	Studentone(int rno,String name,int age)
	{
		this.rollno=rno;
		this.age=age;
		this.name=name;
	}

	
	public int compareTo(Studentone stu) {
		// TODO Auto-generated method stub
		
		if(rollno==stu.rollno)
			return 0;
		else
			if(rollno>stu.rollno)
		return 1;
			else
				return -1;
		
	}
}
