package Abstract;

abstract public class Shape 
     {
	  abstract void area();
     

    
	public static void main(String[] arg)
	{
		square s=new square();
		    s.side=10;
		    s.area();
	}
	}
	
     	
	
	 class square extends Shape
     {
    	int side;
    	void area()
    	{
    		System.out.println(side*side);
		  
	  }
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) {
		

	}

}
