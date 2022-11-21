package array;

public class Two_Element_single_Array {

	public static void main(String[] args) {
		int a[]= {5,10,0,5,8,2,3};
		int i=0;
		for(i=0; i<a.length; i++)
		{
			int n=a[i];
			
			for(int j=i+1; j<a.length; j++)
			{
				if(n+a[j]==10)
				{
					System.out.println(n+" "+a[j]);
				}
			}
			
		}
	}

}
