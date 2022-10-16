package Assignment2;

public class FindBiggestNumberinArray9 {

	public static void main(String[] args) {
		int a[]= {7,5,3,1,9,11,4};
		int large=a[0];
		for(int i=0; i<a.length; i++)
		{
		if(a[i]<large)
		{
			large=a[i];
		
		}
	}
	  System.out.println("The Biggest Number in Array is= " + large);
  }
}


