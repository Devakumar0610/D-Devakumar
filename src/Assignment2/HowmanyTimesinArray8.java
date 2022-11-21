package Assignment2;

public class HowmanyTimesinArray8 {

	public static void main(String[] args) {
		int a[]= {7,4,3,5,2,23,4,2,38,2};
		int x=2;
		int count=0;
		for(int i=0; i<a.length; i++)
		{
		 if(x==a[i])
		 {
			 count++;
		}}
		 System.out.println("How Many Time in Array"  + count+ "Time");
		}

	}


