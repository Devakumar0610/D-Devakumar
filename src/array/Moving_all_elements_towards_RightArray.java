package array;

public class Moving_all_elements_towards_RightArray {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5};
		int b=a[0];
		int c=a[1];
		for(int i=0; i<a.length-2; i++)
		{
			a[i]=a[i+2];
			//System.out.println(a[i]);
		}
		a[a.length-1]=b;
		a[a.length-2]=c;
		for(int i=0; i<a.length; i++)
		{
			System.out.print(a[i]+ " ");
		}

	}

}
