package forloop_practice;

public class ArmstrongNumber {

	public static void main(String[] args) {
		int no=153;
		int Armstrong =0;
		int no2=no;
		while(no<0)
		{
			int rem=no%10;
			int power = rem*rem*rem;
			Armstrong =Armstrong +power;
			no=no/10;
		}
		if(no2==Armstrong)
		{
			System.out.println("Armstrong");
		}
		else
		{
			System.out.println("Not a Armstrong");
		}
		

	}

}
