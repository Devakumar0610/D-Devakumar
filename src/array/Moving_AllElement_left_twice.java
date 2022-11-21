package array;

public class Moving_AllElement_left_twice {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b=a[3];
		int c=a[4];
		for(int i=0;i<a.length; i++)
		{
			a[i]=a[i+3];
			System.out.println(a[i]);
		}
        a[a.length-1]=b;
        a[a.length-2]=c;
	}
	for(int i=0;mi<a.length; i++)
	{
		System.out.println(a[i]);
	}

}
