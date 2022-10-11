package nested_loop;

public class Pattern12 {

	public static void main(String[] args) {
		int n = 9;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j <n-i; j++) {
				System.out.print(" ");
			}
			for (int k = 0; k <i-1; k++) {
				System.out.print("*");
			}
			for (int s = 0; s <i; s++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		for(int a=0; a<n; a++)
		{
		for(int b=0; b<a; b++)
		{
			System.out.print(" ");
		}
		for(int c=0; c<n-a; c++)
		{
			System.out.print("*");
		}
		for(int e=0; e<n-a-1; e++)
		{
			System.out.print("*");
		}
		
		System.out.println();
		}
	}	
}
