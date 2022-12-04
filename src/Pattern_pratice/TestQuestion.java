package Pattern_pratice;

public class TestQuestion {

	public static void main(String[] args) {
		int n=5;
		for(int row=0; row<n; row++)
		{
		 for(int space=0; space<n-row; space++)
		 {
			 System.out.print(" ");
		 }
		 for(int col=0; col<=row; col++)
		 {
			 System.out.print(col+1);
		 }
		 System.out.println();
		 
		}

	}

}
