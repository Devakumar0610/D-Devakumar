package Pattern_pratice;

public class pattern_Test {

	public static void main(String[] args) {
		int n=3;
		for(int row=n; row>0; row--)
		{
			for(int space=n-row+1; space>0; space--)
			{
				System.out.print(" ");
			}//2nd for
			for(int col=1; col<=row; col++ )
			{
			System.out.print(row*2+" ");	
			}//3rd for
		
			System.out.println();
		}//1st for

	}// main

}//class
