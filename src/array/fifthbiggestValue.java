package array;

public class fifthbiggestValue {

	public static void main(String[] args) {
		fifthbiggestValue s = new fifthbiggestValue();
		        s.fifth_biggest_Value();
	}
		private void fifth_biggest_Value() {
		
			int a[] = {2,5,8,3,1,17,7,9};
		    int max =0;
		    int n=0;
		    
		    for(int i=1; i<=5; i++)
		    {
		    	max=0;
		    	for(int j=0; j<a.length; j++)
		    	{
		    		if(a[j]>max)
		    		{
		    			max = a[j];
		    			n=j;
		    		}
		    	}
		    a[n]=0;
		    }
			System.out.println("Position is" + n + "And Fith Biggest Value is" + max);
	}

}


