package For_loop;

public class Primenumbe {

	public static void main(String[] args) {
	int n=1;
	boolean flag= false;
	for(int i=2; i<n; i++)
	{
     if(n%i==0)
     {
      flag = true;
     }
	}
	if(flag == true)
	{
		System.out.println("Not Prime");
	}
	else
	{
	System.out.println("Prime Number");	
	}
	}

}
