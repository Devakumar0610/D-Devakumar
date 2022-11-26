package Pattern_pratice;

public class Rightincrement {

	public static void main(String[] args) {
		//int n=5;
		for(int row=5; row>=1; row--)
		{
			for(int col=1; col<=row; col++)
			{
				System.out.print(col+" ");
			}
			System.out.println();
		}

	}

}
