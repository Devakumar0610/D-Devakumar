package Assignment1;

public class Print22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=123456;
		int sum;
		int reverse =0;
		int i=1;
		while(n!=0) {
			sum=n%10;
			reverse=reverse*10+sum;
			n=n/10;
			
		}
		System.out.print(reverse);	
	}

}
