package String;

public class RecurssionFactorial {
	int n=1;
	int fact=1;
	void m1() 
	{
		fact =fact*n;
		System.out.println(fact);
	    n++;
	 if(n<=5) {
		 m1();
	 	 
	 }
	}
	public static void main(String[] args) {
		
		RecurssionFactorial s=new RecurssionFactorial();
		                s.m1();
	}

}
