package For_loop;

public class PrimeNumber {

	public static void main(String[] args) {
	int n=13;
	
	boolean flag= false;
	
	for(int i=1;i<n; i++)
	{
		if(n%i == 0)
		{
			flag = true;
		     
			 break;
		}
	}
	if (!flag)
		System.out.println("prime");
	else
		System.out.println("Not prime");
		
	}
	
}
