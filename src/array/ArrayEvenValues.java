package array;

public class ArrayEvenValues 
{
	public static void main(String[] args)
	{
    int a[]= {2,4,5,6,7,8,9,10};
	int count=0;

    for(int i=0;i<a.length;i++)
    {	
    	if(a[i]%2==0)
    	{
    		count++;
    }
    }
	  int b[]=new int[count];
	   int j=0;
    	for(int i=0;i<a.length;i++)
        {	
        	if(a[i]%2==0)
        	{
        	b[j]=a[i];
            j++;
        	}
        	
        }
        	
    for( j=0;j<b.length;j++)
    {
    	System.out.print(b[j]+" ");
    }
	}
}
