package Pattern_pratice;

public class Pattern12 {

	public static void main(String[] args) {
		int n=5;
		int a=1;
		
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i<=j)
				{
					System.out.print(a+ " ");
					a=a+1;
				}
				else {
					System.out.print("*" + " ");
				}
			}
			System.out.println();
			a=1;
		}

	}

}


	


