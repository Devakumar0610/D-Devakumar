package forloop_practice;

public class Ternary5 {

	public static void main(String[] args) {
		int n01=100;
		int n02=120;
		
		int div=2;
		int gcd=0;//Common divisor of Two given number
		int small=n01<n02?n01:n02;
		while(div<small)
		{
			if(n01%div== 0 && n02%div==0)
			{
				gcd=div;
				
				}
			div=div+1;
		}
		System.out.println(gcd);
	}
}
