package array;

public class Bubble_sort {

	public static void main(String[] args) 
	{
		int a[] = { 10, 8, 6, 4 };
		for (int i = 1; i < a.length; i++)
		 {
			for (int j = 0; j < a.length - i; j++)
			{
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
					
				}

			}
			for (int k = 0; k < a.length; k++) 
			{
				System.out.print(a[k] + " ");
			}
		}

	}

}
