package Finalkeyword;

public final class Deva {
	 void data()
     {                                         //final Method
      System.out.println("Data Processing");
     }
     
	 public static void main(String[] args) 
     {
 		
        Child s=new Child();
             s.data();
     }
}

    class Child extends Parent
    {
 	void data()
 	{
 	System.out.println("Data Analysis");	
 	}

 		
}


