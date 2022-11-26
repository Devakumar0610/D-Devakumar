package array;

public class fifth_biggest_Number {

	public static void main(String[] args) {
		
		int a[]= {2,5,8,3,1,17,7,9};
		int higest =0;
		int big5= Integer.MIN_VALUE;	
		for(int i=0; i<a.length; i++)
		{
		 if(a[i]>big5)
		 {
			 big5=a[i];
		 }
		}
		 System.out.println("The fifth biggest value in Array" + higest);
		
			
		}

	}


