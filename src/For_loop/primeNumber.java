package For_loop;

public class primeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n= 27;
    boolean flag= false;
    for(int i=2; i<n; i++)
    {
     if(n%i==0)	
     {
    	 flag=false;
    	 
    	 break;
     }
    }
    if(flag == true)
    {
    	System.out.println(" Not prime Number");
    }
    else
    {
    	System.out.println("prime Number");
    }
    		
    }
    
	}


