package array;

public class ArrayValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a[]= {1,25,4,5,6};
        int b;
        for(int i=0; i<a.length-1; i++)
        {
        	b=a[i]-a[i+1];
        	System.out.println(b);
    	}
      }
        
	}


