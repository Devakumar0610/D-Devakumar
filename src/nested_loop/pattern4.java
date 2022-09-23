package nested_loop;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=7;
		 for(int i=0; i<n; i++)
		 {
		  for(int j=0; j<n-i; j++)	 
		  {
		 System.out.print(" ");                    //Right increasing triangle//
		 
		}
		  for(int k=0; k<i; k++)
		  {
			  System.out.print("*");
		  }
		  System.out.println();
	}

}
}
