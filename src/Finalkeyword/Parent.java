package Finalkeyword;

public class Parent { 
	         final void data()
	        {                                         //final Method
	         System.out.println("Data Processing");
	        }
	        public static void main(String[] args) {
	    		// TODO Auto-generated method stub
	           child s=new child();
	                s.data();
	        }
}

	         class child extends Parent
	    {
	    	void data()
	    	{
	    	System.out.println("Data Analysis");	
	    	}
	   
        		
	}


