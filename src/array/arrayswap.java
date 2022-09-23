package array;

public class arrayswap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int a[] = {1,2,3,7,6};
     int b;
     b=a[a.length-1];
     for(int i=a.length-1; i>0;i--)
     {
    	 a[i]=a[i-1];
     }
     a[0]=b;
     b=a[4];
         
    	 System.out.println(b);
     }
	}


