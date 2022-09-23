package nested_loop;

public class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		 for(int i=0; i<=n; i++)
		 {                                             
		  for(int j=0; j<=n; j++)	 
		  {
			  if(i+j==10 )
			  {
		  System.out.print("* ");
			  }
			  
			  else
			  {
				  System.out.print(" ");
			  }
		  }
		  System.out.println();
	}

}
}
