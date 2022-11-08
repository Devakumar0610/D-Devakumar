package Pattern_pratice;

public class Practice7 {

	public static void main(String[] args) { 
	int n=5;
		for(int col=1; col<=n; col++)
		{
			for(int row=1; row<=n+1-col; row++)
			{
			System.out.print(row);
		}
		System.out.println();

	}

}}
