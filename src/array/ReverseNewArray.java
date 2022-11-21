package array;

public class ReverseNewArray
{
	public static void main(String[] args)
	{
int a[]= {10,20,35,40,75,13,80};
int b[]= new int[a.length];

		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int i=b.length-1;i>=0;i--)
		{
				System.out.print(b[i]+" ");
		}	
	}
}
