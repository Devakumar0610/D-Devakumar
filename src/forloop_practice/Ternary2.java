package forloop_practice;

public class Ternary2 {

	public static void main(String[] args) {
		
		int n0=100;
		int div=2;
		int count=0;
		while(div<n0)
		{
			if(n0%div== 0)
			{
				System.out.println(div);
				count=count+1;
				}
			div=div+1;
		}
		System.out.println("count No "  + "= " + count );

	}

}
