package Assignment2;

public class ArrayLinearSearch4 {

	public static void main(String[] args) {
//		int a[]= {6,5,9,3,7,2,1};
//		int x=7;
//		for(int i=0; i<a.length; i++)
//		{
//		if(x==a[i])
//		{
//			System.out.println(a[i]);
//		}
//		}
//	}
//
//}
		int a[]= {6,5,9,3,7,2,1};
		int x=7;
		for(int i=0; i<a.length-1; i++)
		{
		if(x==a[i])
		{
			System.out.println("Element fount index is :" + i);
		}
		else {
			System.out.println("Element not fount");
		}
		}
	}
}