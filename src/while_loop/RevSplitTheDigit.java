package while_loop;
public class RevSplitTheDigit {

	public static void main(String[] args) {
		
		int num = 7589;
		int rev = 0;
		while(num>0) 
		{
	    int rem=num%10;
	    num=num/10;
	    rev=rev*10+rem;	
		}
		System.out.println(rev);
	}

}
