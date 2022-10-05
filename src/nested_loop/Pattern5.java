package nested_loop;

public class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int n=7;
    for(int i=0; i<n; i++)
    {
     for(int j=0; j<n; j++) 
     {
    	 if(i==1||i==n||j==1||j==n)
    	 {
    	 System.out.print(" ");
     }
     System.out.println("*");
    }
    
	}

	}}
