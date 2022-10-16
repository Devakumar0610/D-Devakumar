package Polymorphsim;

public class ICICI extends RBI {
	
		int interestRate()
		{
			return 5;
		}
	

	public static void main(String[] args) {
	ICICI s=new ICICI ();
		  s.account();
		 int a= s.interestRate();
		 System.out.println(a);
	}

}
