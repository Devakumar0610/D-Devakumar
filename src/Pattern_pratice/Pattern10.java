package Pattern_pratice;

public class Pattern10 {

	public static void main(String[] args) {
		int n=5;
		int a=5;
		for(int i=0; i<n; i++)
		{
			for(int j=0; j<n; j++)
			{
				if(i+j<=n-1) {
			System.out.print(a+" ");
			
				}
				else {
					System.out.print(" "+" ");
				}
			}
			System.out.println();
			a--;

	}

}
}