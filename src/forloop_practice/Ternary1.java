package forloop_practice;

public class Ternary1 {

	public static void main(String[] args) {
		
		int n0=100;
		int div =2;
		while(div<n0)
		{
			if(n0%div == 0)
			{
				System.out.println(div);
			}
			div=div+1;
		}

	}

}
