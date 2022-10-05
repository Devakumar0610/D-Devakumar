package array;

public class SecondMaximum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[]= {6,8,2,10,12};	
	    int max = a[0];
	    int b=0;
	    int max1 =a[0];
	    for(int i=0; i<a.length; i++)
	    {
	    if(a[i]>max)	
	    {
	    	max=a[i];
	    	b=i;
	    }
	   }
	   System.out.println(max); 
	  // System.out.println(b);
	   //max=a[b];
	   for(int j=0; j<a.length; j++)
	   {
	   if(a[j]>max1 && a[j]!=max)	   
	   {
		   max1=a[j];
	   }
		   } 
	   System.out.println(max1);
	   }

}
