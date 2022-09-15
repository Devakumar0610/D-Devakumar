package while_loop;

public class ReverseNumberDigit {

	public static void main(String[] args) {
		int num=5432,r=0;
		
	       int t=num,reverse=0;
	       while(num>0)
	       {
	        t=num%10;//2
	        reverse=(reverse*10)+t;//2
	        r=r+t;//
	        System.out.println(r);
	        System.out.println(reverse);
	        num=num/10;
	       }
	       System.out.println(r);
	       System.out.println(reverse);
	       
	       
	       
	       }
	       
	 

	}


