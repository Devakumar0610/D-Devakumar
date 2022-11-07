package forloop_practice;

public class Ternary3 {

	public static void main(String[] args) {
		int n0=13;
		int div=2;
		int count=0;
		while(div<n0)
		{
			if(n0%div== 0)
			{
				//System.out.println(div);
				count=count+1;
				}
			div=div+1;
		}
		if(count==0)
		{
			System.out.println("Prime No");
		}
		else
		{
		System.out.println("Not a Prime No" );

	}

	}
}

	


