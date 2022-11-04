package constructor;

import Oopsconcepts.student;

public class Student 
   {
	int rollNo;
	String name;
	int mark;
	Student(int rollNo,String name,int mark)
	{
	this.rollNo= rollNo;
	this.name="name";
	this.mark= mark;
	}
	void a()
	{
		System.out.println(rollNo);
		System.out.println(name);
		System.out.println(mark);
			

		}
	
	
	
	

	public static void main(String[] args) {
	//Student.s=new Student();
	Student s1=new Student(100,"Deva",98);
          s1.a();
	}

}
