package Finalkeyword;

public class Parent { 
	        final void data()
	        {     
	        int p=56;               //final Method
	        System.out.println("Data Processing");
	        }
	        public static void main(String[] args) {
	    		
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


