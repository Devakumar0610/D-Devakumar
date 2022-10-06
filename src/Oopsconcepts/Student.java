package Oopsconcepts;

public class Student {
	
    	int rollno;
    	String name;
    	int mark;
    	void dis() 
    	{
    		
    		System.out.println(rollno);
    		System.out.println(name);
    		System.out.println(mark);
    	}
        
    	public static void main(String[] args)
    	{
    		Student s1= new Student();
    		        s1.rollno =101;
    		        s1.name = "Siva";
    		        s1.mark = 50;
                     s1.dis();
       
    
    	Student s2= new Student();
        s2.rollno =102;
        s2.name = "Muthu";
        s2.mark = 60;
        s2.dis();
	}
    
    
}