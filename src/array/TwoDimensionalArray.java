package array;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][]= {{1,2,3}, // 0index
				    {4,5,6},  // 1 index
				    {7,8,9}};
		int b=0;
		for(int i=0; i<3; i++)
		{
		 for(int j=0; j<3; j++)	
		 {
			 b=a[i][j]+b;
		 }
			 System.out.println(b);
			 b=0;
		 }
		}
	}


