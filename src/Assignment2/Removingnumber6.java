package Assignment2;

public class Removingnumber6 {

	public static void main(String[] args) {
		int a[]= {7,5,3,9,2,4,1};
		int x=2;
		for(int i=0; i<a.length; i++)
		{
		if(x==a[i])
		{
			continue;
		}
		System.out.println(a[i]);
		}
	}

}
