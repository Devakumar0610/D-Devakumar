package Oopsconcepts;

public class student {
	int  rollNo;
	String name;
	int mark;
	char Grade;
	
	void setGrade()
	{
	 if(mark<=100&&mark>=91) {
		 Grade ='A';
	 }
	 else if(mark<=90&&mark>=81) {
		 Grade ='B';	 
	 }
	 else if(mark<=80&&mark>=71) {
		 Grade ='C';
	 }		 
	 else if(mark<=70&&mark>=61) {
		 Grade ='D';
	 }
	 else if(mark<=60&&mark>=51) {
		 Grade ='E';			 
	}
	}
	public static void main(String[] args) 
	{
	student s1 = new student();
	        s1.rollNo = 100;
	        s1.name   = "Raja";
	        s1.mark   = 90;
	        s1.setGrade();
	        System.out.println(s1.Grade);
	
	        student s2 = new student();
	        s2.rollNo = 200;
	        s2.name   = "Deva";
	        s2.mark   = 80;
	        s2.setGrade();
	        System.out.println(s2.Grade);        
    
    }
	}


